package Day5;
import java.util.ArrayList;
import java.util.Scanner;
public class TestGoods {
/*-------------库存管理------------
1.查看库存清单
2.修改商品库存数量
3.退出
请输入要执行的操作序号：
 	每一项功能操作，我们采用方法进行封装，这样，可使程序的可读性增强。
选择“1.查看库存清单”功能，则控制台打印库存清单
选择“2.修改商品库存数量”功能，则对每种商品库存数进行更新
选择“3.退出”功能，则退出库存管理，程序结束*/
	public static int chooseFunction()
	{
		//库存管理功能菜单
		System.out.println("-------库存管理-------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		Scanner sc = new Scanner(System.in);
		//管理员键盘输入功能操作序号
		int choose = sc.nextInt();
		return choose;
	}
	public static void main(String[] args) {
		//创建一个可以存储多种货物的容器，纪律库存商品信息
		ArrayList<Goods> good = new ArrayList<Goods>();
		//添加库存商品信息
		addgood(good);
		//通过while循环模拟管理员进行功能重复选择操作
		while(true)
		{
			int choose=chooseFunction();
			switch(choose)
			{
			case 1:
				//1.查看库存清单
				printScore(good);
				break;
			case 2:
				//2.修改商品库存数量
				update(good);
				break;
			case 3:
				//3.退出
				exit();
				return;
			default:
				System.out.println("----------------------------------");
				System.out.println("功能选择有误，请输入正确的功能序号!");
				break;
			}
		}
	}
	public static void addgood(ArrayList<Goods> good)
	{
		//初始化该库存管理系统
		System.out.println("请为该仓库添加货物：");
		for(int n=0;n<2;n++)//n的条件不能是good.size(),good在未被初始化的条件下得到的good.size()是0，不能进入循环
		{
			Scanner sc = new Scanner(System.in);
			//实例化货物类Goods,产生新货物g
			Goods g = new Goods();
			System.out.println("存储第"+(n+1)+"个货物的信息：");
			//品牌型号
			System.out.println("请输入品牌：");
			g.brand=sc.next();
			//尺寸大小
			System.out.println("请输入尺寸大小：");
			g.size=sc.nextDouble();
			//价格
			System.out.println("请输入价格：");
			g.price=sc.nextDouble();
			//库存数量
			System.out.println("请输入库存数量：");
			g.amount=sc.nextInt();
			//添加货物g到集合good
			good.add(g);
		}
	}
	public static void printScore(ArrayList<Goods> good)
	{
		System.out.println("---------------------------查看库存清单--------------------------");
		System.out.println("品牌       尺寸大小	价格	库存数量");
		//记录库存总数量
		double sumAmount=0;
		//记录每种商品的总价格
		double money=0;
		//记录所有货物的总价格
		double sumMoney=0;
		for(int i=0;i<good.size();i++)
		{
			//Goods为货物对象，g为实例化的新的货物
			//good为集合对象
			
			//从集合中取出货物对象
			Goods g=good.get(i);
			//商品总数量为每种商品数量之和
			sumAmount += g.amount;
			//每种商品总价格为价格*数量
			money = g.price * g.amount;
			//商品的总价格为每种商品的价格之和
			sumMoney += money;
			System.out.println(g.brand+"  "+g.size+"    "+g.price+"     "+g.amount);
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("总库存数："+sumAmount); 
		System.out.println("库存商品总金额："+sumMoney);
	}
	public static void update(ArrayList<Goods> good)
	{
		System.out.println("------------修改商品库存数量-----------");
		for(int i=0;i<good.size();i++)
		{
			//从集合中取出货物对象
			Goods g = good.get(i);
			System.out.println("请输入第"+g.brand+"品牌商品库存数：");
			g.amount = new Scanner(System.in).nextInt();
		}
	}
	public static void exit()
	{
		System.out.println("-------退出-------");
		System.out.println("-------您已成功退出库存管理系统--------");
	}
}

package JAVA;
/*-------------库存管理------------
1.查看库存清单
2.修改商品库存数量
3.退出
请输入要执行的操作序号：
 	每一项功能操作，我们采用方法进行封装，这样，可使程序的可读性增强。
选择“1.查看库存清单”功能，则控制台打印库存清单
选择“2.修改商品库存数量”功能，则对每种商品库存数进行更新
选择“3.退出”功能，则退出库存管理，程序结束*/
import java.util.Scanner;
public class proManger {
	public static int chooseFunction()
	{
		System.out.println("-------库存管理-------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		return choose;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//记录库存商品信息
		//品牌型号
		String brands[] = new String[]{"vivo","oppo"};
		//尺寸大小
		double sizes[] = new double[]{13.0,14.0};
		//价格
		double prices[] = new double[]{2999,3000};
		//库存数量
		int count[] = new int[]{0,0};
		while(true)
		{
			int choose = chooseFunction();
			switch(choose)
			{
			case 1://查看库存清单
				printScore(brands,sizes,prices,count);
				break;
			case 2://修改商品库存数量
				update(brands,count);
				break;
			case 3://退出
				exit();
				return;
				//break;
			default:
				System.out.println("----------------------------------");
				System.out.println("功能选择有误，请输入正确的功能序号!");
				break;
			}
		}
	}
	public static void printScore(String brands[],double sizes[],double prices[],int count[])
	{
		int sumCount=0;
		int sumMoney=0;
		for(int i=0;i<brands.length;i++)
		{
			sumCount += count[i];
			sumMoney += prices[i];
		}
		System.out.println("---------------------------查看库存清单--------------------------");
		System.out.println("品牌型号       尺寸	价格	库存数");
		for(int i=0;i<brands.length;i++)
		{
			System.out.println(brands[i]+"      "+sizes[i]+"  "+prices[i]+"    "+count[i]);
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("总库存数："+sumCount); 
		System.out.println("库存商品总金额："+sumMoney);
	}
	public static void update(String brands[],int count[])
	{
		System.out.println("------------修改商品库存数量-----------");
		for(int i=0;i<brands.length;i++)
		{
			System.out.println("请输入"+ brands[i] +"商品库存数：");
			count[i] = new Scanner(System.in).nextInt();
		}
	}
	public static void exit()
	{
		System.out.println("----------------退出---------------");
		System.out.println("您已退出系统");
	}
}

package HomeWork;
/*定义一个手机类Phone，包含三个属性品牌(brand)、价格(price)、颜色(color)。
创建四个手机("小米"、"华为"、"乐视"、"奇酷")对象存入ArrayList集合中，并遍历输出。*/
import java.util.ArrayList;
import java.util.Scanner;
public class TestDay5HomeWork5Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Day5HomeWork5Phone> phone=new ArrayList<Day5HomeWork5Phone>();
		newPhone(phone);
		printPhone(phone);
	}
	public static void newPhone(ArrayList<Day5HomeWork5Phone> phone)
	{
		//创建四个手机存入集合对象
		for(int i=0;i<4;i++)
		{
			//创建一个新的手机对象
			Day5HomeWork5Phone p = new Day5HomeWork5Phone();
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入该手机的基本信息：");
			System.out.println("请输入该手机的品牌：");
			p.brand = sc.next();
			System.out.println("请输入该手机的价格：");
			p.price=sc.nextDouble();
			System.out.println("请输入该手机的颜色：");
			p.color=sc.next();
			phone.add(p);
			System.out.println("第"+(i+1)+"个手机的基本信息存储完成！");
		}
	}
	public static void printPhone(ArrayList<Day5HomeWork5Phone> phone)
	{
		//遍历输出四个手机的基本信息
		for(int i=0;i<phone.size();i++)
		{
			Day5HomeWork5Phone p = phone.get(i);
			System.out.println("--------打印手机基本信息--------");
			System.out.println("品牌      "+"价格       "+"颜色");
			System.out.println(p.brand+"  "+p.price+"  "+p.color);
		}
	}
}

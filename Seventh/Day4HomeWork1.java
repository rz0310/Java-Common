package HomeWork;

import java.util.Scanner;

public class Day4HomeWork1 {

	/*(1)键盘录入两个数据,求两个数据之和(整数和小数)
	(2)键盘录入两个数据,判断两个数据是否相等(整数和小数)
	(3)键盘录入三个数据,获取两个数中较大的值(整数和小数)
	(4)打印m行n列的*形矩形
	(5)打印nn乘法表
	(6)计算长方形和圆形的面积
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		isEqual();
		max();
		printXing();
		getArea();
		List();
	}
	public static void sum()
	{
		//键盘录入两个数据,求两个数据之和(整数和小数)
		Scanner sc = new Scanner(System.in);
		System.out.println("求和");
		System.out.println("请输入两个数(前者为整数，后者为小数):");
		int number1=sc.nextInt();
		double number2=sc.nextDouble();
		double sum = (double)number1+number2;
		System.out.println("这两个数的和为："+sum);
	}
	public static void isEqual()
	{
		//键盘录入两个数据,判断两个数据是否相等(整数和小数)
		Scanner sc = new Scanner(System.in);
		System.out.println("判断是否相等");
		System.out.println("请输入两个数(前者为整数，后者为小数):");
		int number1=sc.nextInt();
		double number2=sc.nextDouble();
		if((double)number1==number2)
		{
			System.out.println("这两个数相等");
		}
		else
		{
			System.out.println("这两个数不相等");
		}
	}
	public static void max()
	{
		//键盘录入两个数据,获取两个数中较大的值(整数和小数)
		Scanner sc = new Scanner(System.in);
		System.out.println("求最大值");
		System.out.println("请输入两个数(前者为整数，后者为小数):");
		int number1=sc.nextInt();
		double number2=sc.nextDouble();
		double max=0;
		if((double)number1>=number2)
		{
			max=number1;
		}
		else{
			max=number2;
		}
		System.out.println("最大值为："+max);
	}
	public static void printXing()
	{
		//打印m行n列的*形矩形
		Scanner sc = new Scanner(System.in);
		System.out.println("打印m行n列的*形矩形");
		System.out.println("请输入两个整数(分别作为行号和列号):");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			//System.out.println("***");
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void List()
	{
		//打印nn乘法表
		int n=new Scanner(System.in).nextInt();
		System.out.println("打印nn乘法表");
		System.out.println("请输入一个整数表示你要打印几行几列的乘法表：");
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
	public static void getArea()
	{
		//计算长方形和圆形的面积
		System.out.println("计算长方形和圆形的面积");
		int length=6;
		int width=2;
		int radius=5;
		double RectArea=length*width;
		double circleArea=3.14*radius*radius;
		System.out.println("长方形的面积为："+RectArea);
		System.out.println("圆的面积为："+circleArea);
	}

}

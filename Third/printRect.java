package JAVA;
import java.util.Scanner;
public class printRect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRect1();
		printRect2(3,4);
//		System.out.println(getNumber());
//		System.out.println(getAvg(1.0,2.0,3.0));
	}
	public static void printRect1()
	{
		for(int i=0;i<3;i++)
		{
			//System.out.println("***");
			for(int j=0;j<3;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static int getNumber()
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	public static void printRect2(int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static double getAvg(double x,double y,double z)
	{
		double result = (x+y+z)/3;
		return result;
	}
}

package JAVA;

public class MethodDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = add(1,2);
		int sum2 = add(1,2,3);
		double sum3 = add(1.1,1.2);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
	public static int add(int x,int y)
	{
		return x + y ;
	}
	public static int add(int x,int y,int z)
	{
		return x + y + z;
	}
	public static double add(double x,double y)
	{
		return x + y;
	}
}

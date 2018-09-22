package JAVA;
public class MethodDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area  = getArea(3,5);
		System.out.println("The area is " + area);
	}
	public static int getArea(int x,int y)
	{
		int temp = x * y;
		return temp;
	}

}

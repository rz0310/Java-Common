package JAVA;

public class ArguementsDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3};
		change(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void change(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] *= 2;
		}
	}

}

package JAVA;

public class ArrayDemo09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//一维数组的累加和遍历
		int[] arr={1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			sum +=arr[i];
		}
		System.out.println("sum="+sum);
		System.out.println("-------------------");
		//二维数组的累加和和遍历
		int[][] arr2={{1,2},{3,4,5,6},{7,8,9}};
		int sum2=0;
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				sum2 += arr2[i][j];
			}
		}
		System.out.println("sum2="+sum2);
		System.out.println("-------------------");
	}

}

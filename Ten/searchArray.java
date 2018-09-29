package HomeWork;

public class searchArray {

	/*
	 * 数组元素查找(查找指定元素第一次在数组中出现的索引)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
		int num = 7;
		int index = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				index = i;
			}
		}
		System.out.println("index="+index);
	}

}

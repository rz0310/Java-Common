package HomeWork;

public class changeArray {

	/*
	 *数组元素逆序 (就是把元素对调)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一维数组
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
		//从大到小排序
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}

package HomeWork;

public class bianliArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组遍历(依次输出数组中的每一个元素)
		//定义二维数组
		//二维数组遍历获取到每一个值
		int arr[][]= new int[][]{{1,2,3,4},{5,6,7},{8,9}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}

}
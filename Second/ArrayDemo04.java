package JAVA;

public class ArrayDemo04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,56,78,9,45};//定义一个数组并静态初始化
		int max=arr[0];//定义一个max用来保存最大数，假设第一个元素为最大值
		//for循环遍历数组的每一个元素
		for(int i=1;i<arr.length;i++)
		//i初始化为1，进行for循环时，只需要从数组的第二个元素开始比较提高程序运行的效率
		{
			//比较数组的每个元素与max的大小
			if(max<arr[i])
			{
				//如果某个元素比max还要大，把它的值赋给max
				max=arr[i];
			}
		}
		System.out.println("max="+max);//打印出最大值max
	}

}

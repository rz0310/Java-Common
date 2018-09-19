package JAVA;

public class ArrayDemo07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义二维数组的方式
		int [][] arr = new int[3][4];
		//输出二维数组的地址
		System.out.println(arr);
		System.out.println("二维数组的长度："+arr.length);
		//获取二维数组的三个元素
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("打印第一个一维数组的元素值");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		System.out.println("打印第二个一维数组的元素值");
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[1][3]);
		System.out.println("打印第三个一维数组的元素值");
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		System.out.println(arr[2][3]);
	}

}

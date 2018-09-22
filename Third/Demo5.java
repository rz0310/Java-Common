package JAVA;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
//				System.out.println(arr[i]);
//				System.out.println(arr[j]);
			}
		}
		System.out.println("数组元素的最大值为："+arr[arr.length-1]);
	}
}

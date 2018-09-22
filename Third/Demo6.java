package JAVA;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int number = 7;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(number == arr[i])
			{
				index = i;
			}
			else 
			{
				index = -1;
			}
		}
		System.out.println(index >= 0?("元素" + number + "在数组中的索引是" + index):"数组中没有元素"+number);
	}
}

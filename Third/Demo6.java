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
		System.out.println(index >= 0?("Ԫ��" + number + "�������е�������" + index):"������û��Ԫ��"+number);
	}
}

package HomeWork;

public class maxArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������(������������е�ÿһ��Ԫ��)
		//����һά����
		int arr[]= new int[]{1,2,3,4,5,6,7,8,9};
		//��С��������
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("max="+arr[arr.length-1]);
	}

}
package JAVA;

public class ArrayDemo04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,56,78,9,45};//����һ�����鲢��̬��ʼ��
		int max=arr[0];//����һ��max��������������������һ��Ԫ��Ϊ���ֵ
		//forѭ�����������ÿһ��Ԫ��
		for(int i=1;i<arr.length;i++)
		//i��ʼ��Ϊ1������forѭ��ʱ��ֻ��Ҫ������ĵڶ���Ԫ�ؿ�ʼ�Ƚ���߳������е�Ч��
		{
			//�Ƚ������ÿ��Ԫ����max�Ĵ�С
			if(max<arr[i])
			{
				//���ĳ��Ԫ�ر�max��Ҫ�󣬰�����ֵ����max
				max=arr[i];
			}
		}
		System.out.println("max="+max);//��ӡ�����ֵmax
	}

}

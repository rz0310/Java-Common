package JAVA;

public class ArrayDemo08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][];//����һ������Ϊ3�Ķ�ά����
		int sum=0;//���������¼�����۶�
		arr[0]=new int[]{11,12};//Ϊ�����Ԫ�ظ�ֵ
		arr[1]=new int[]{21,22,23};
		arr[2]=new int[]{31,32,33,34};
		for(int i=0;i<arr.length;i++)//��������Ԫ��
		{
			int groupsum=0;//���������¼С�������۶�
			for(int j=0;j<arr[i].length;j++)//����С��ÿ���˵����۶�
			{
				groupsum += arr[i][j];//ÿ��С������۶�
			}
			sum += groupsum;//�ۼ�С�����۶�
			System.out.println("��"+(i+1)+"��С������۶�Ϊ��"+groupsum+"��Ԫ");
		}
		System.out.println("�ܵ����۶�Ϊ��"+sum+"��Ԫ");
	}

}

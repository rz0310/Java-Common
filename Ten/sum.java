package HomeWork;
/*
 * ��˾�����۶����
		ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ)
		��һ���ȣ�22,66,44
		�ڶ����ȣ�77,33,88
		�������ȣ�25,45,65
		���ļ��ȣ�11,66,99
 */
public class sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ά����
		int sum[][] = new int[][]{{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int count=0;//��¼��
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				//���
				count += sum[i][j]; 
			}
		}
		System.out.println("��˾��������ܶ�Ϊ:"+count+"��Ԫ");
	}

}

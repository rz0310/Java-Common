package JAVA;
/*-------------������------------
1.�鿴����嵥
2.�޸���Ʒ�������
3.�˳�
������Ҫִ�еĲ�����ţ�
 	ÿһ��ܲ��������ǲ��÷������з�װ����������ʹ����Ŀɶ�����ǿ��
ѡ��1.�鿴����嵥�����ܣ������̨��ӡ����嵥
ѡ��2.�޸���Ʒ������������ܣ����ÿ����Ʒ��������и���
ѡ��3.�˳������ܣ����˳��������������*/
import java.util.Scanner;
public class proManger {
	public static int chooseFunction()
	{
		System.out.println("-------������-------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		return choose;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��¼�����Ʒ��Ϣ
		//Ʒ���ͺ�
		String brands[] = new String[]{"vivo","oppo"};
		//�ߴ��С
		double sizes[] = new double[]{13.0,14.0};
		//�۸�
		double prices[] = new double[]{2999,3000};
		//�������
		int count[] = new int[]{0,0};
		while(true)
		{
			int choose = chooseFunction();
			switch(choose)
			{
			case 1://�鿴����嵥
				printScore(brands,sizes,prices,count);
				break;
			case 2://�޸���Ʒ�������
				update(brands,count);
				break;
			case 3://�˳�
				exit();
				return;
				//break;
			default:
				System.out.println("----------------------------------");
				System.out.println("����ѡ��������������ȷ�Ĺ������!");
				break;
			}
		}
	}
	public static void printScore(String brands[],double sizes[],double prices[],int count[])
	{
		int sumCount=0;
		int sumMoney=0;
		for(int i=0;i<brands.length;i++)
		{
			sumCount += count[i];
			sumMoney += prices[i];
		}
		System.out.println("---------------------------�鿴����嵥--------------------------");
		System.out.println("Ʒ���ͺ�       �ߴ�	�۸�	�����");
		for(int i=0;i<brands.length;i++)
		{
			System.out.println(brands[i]+"      "+sizes[i]+"  "+prices[i]+"    "+count[i]);
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("�ܿ������"+sumCount); 
		System.out.println("�����Ʒ�ܽ�"+sumMoney);
	}
	public static void update(String brands[],int count[])
	{
		System.out.println("------------�޸���Ʒ�������-----------");
		for(int i=0;i<brands.length;i++)
		{
			System.out.println("������"+ brands[i] +"��Ʒ�������");
			count[i] = new Scanner(System.in).nextInt();
		}
	}
	public static void exit()
	{
		System.out.println("----------------�˳�---------------");
		System.out.println("�����˳�ϵͳ");
	}
}

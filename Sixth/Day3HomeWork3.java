package HomeWork;
/*
 * �����������󣬲��ô���ʵ�֣�
	(1)����¼���������������մ�С�����˳�����
	(2)����û��������3 2 1���������к��ӡ��ʽ"���մ�С����������˳��Ϊ��1 2 3"
 */
import java.util.Scanner;
public class Day3HomeWork3 {

	/*
	 * ����¼���������������մ�С�����˳�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������������������");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max = num1;
		if(num2>num1)
		{
			max = num2;
			if(num3>num2)
			{
				max = num3;
			}
		}
		else if(num3 >num2)
		{
			max = num3;
		}
		System.out.println("max="+max);
	}
}

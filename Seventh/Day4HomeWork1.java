package HomeWork;

import java.util.Scanner;

public class Day4HomeWork1 {

	/*(1)����¼����������,����������֮��(������С��)
	(2)����¼����������,�ж����������Ƿ����(������С��)
	(3)����¼����������,��ȡ�������нϴ��ֵ(������С��)
	(4)��ӡm��n�е�*�ξ���
	(5)��ӡnn�˷���
	(6)���㳤���κ�Բ�ε����
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		isEqual();
		max();
		printXing();
		getArea();
		List();
	}
	public static void sum()
	{
		//����¼����������,����������֮��(������С��)
		Scanner sc = new Scanner(System.in);
		System.out.println("���");
		System.out.println("������������(ǰ��Ϊ����������ΪС��):");
		int number1=sc.nextInt();
		double number2=sc.nextDouble();
		double sum = (double)number1+number2;
		System.out.println("���������ĺ�Ϊ��"+sum);
	}
	public static void isEqual()
	{
		//����¼����������,�ж����������Ƿ����(������С��)
		Scanner sc = new Scanner(System.in);
		System.out.println("�ж��Ƿ����");
		System.out.println("������������(ǰ��Ϊ����������ΪС��):");
		int number1=sc.nextInt();
		double number2=sc.nextDouble();
		if((double)number1==number2)
		{
			System.out.println("�����������");
		}
		else
		{
			System.out.println("�������������");
		}
	}
	public static void max()
	{
		//����¼����������,��ȡ�������нϴ��ֵ(������С��)
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ֵ");
		System.out.println("������������(ǰ��Ϊ����������ΪС��):");
		int number1=sc.nextInt();
		double number2=sc.nextDouble();
		double max=0;
		if((double)number1>=number2)
		{
			max=number1;
		}
		else{
			max=number2;
		}
		System.out.println("���ֵΪ��"+max);
	}
	public static void printXing()
	{
		//��ӡm��n�е�*�ξ���
		Scanner sc = new Scanner(System.in);
		System.out.println("��ӡm��n�е�*�ξ���");
		System.out.println("��������������(�ֱ���Ϊ�кź��к�):");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			//System.out.println("***");
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void List()
	{
		//��ӡnn�˷���
		int n=new Scanner(System.in).nextInt();
		System.out.println("��ӡnn�˷���");
		System.out.println("������һ��������ʾ��Ҫ��ӡ���м��еĳ˷���");
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
	public static void getArea()
	{
		//���㳤���κ�Բ�ε����
		System.out.println("���㳤���κ�Բ�ε����");
		int length=6;
		int width=2;
		int radius=5;
		double RectArea=length*width;
		double circleArea=3.14*radius*radius;
		System.out.println("�����ε����Ϊ��"+RectArea);
		System.out.println("Բ�����Ϊ��"+circleArea);
	}

}

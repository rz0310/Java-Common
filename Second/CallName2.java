package JAVA;
import java.util.Scanner;
import java.util.Random;
public class CallName2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.�洢ȫ��ͬѧ����
//		2.��ӡȫ��ͬѧÿһ���˵�����
//		3.�ڰ༶��������Χ�ڣ��������һ������������Ҹ����������Ӧ��ͬѧ����
		String student[] = new String[3];//����һ���洢����ͬѧ���ֵ�����(����)
		addStudentName(student);//�洢����ͬѧ������
		printStudentName(student);//��ӡ����ͬѧ������
		randomStudentName(student);//�漴���ߵ���ͬѧ������
	}
	public static void addStudentName(String student[])
	{
		//�������������ִ洢��������
		Scanner sc = new Scanner(System.in);
		for(int i=0 ;i<student.length;i++)
		{
			student[i] = sc.next();
			System.out.println("�洢��"+(i+1)+"��ѧ������:");
		}
	}
	public static void printStudentName(String student[])
	{
		for(int i=0;i<student.length;i++)
		{
			//�������飬�õ�ÿ��ͬѧ������
			System.out.println("��ӡ��"+(i+1)+"��ѧ������:");
			String name=student[i];
			//��ӡ����
			System.out.println(name);
		}
	}
	public static void randomStudentName(String student[])
	{
		//�������鳤�ȣ���ȡ�������
		//int index=new Random().nextInt(student.length);
		Random ran=new Random();
		//ͨ����������������л�ȡ����
		int index=ran.nextInt(student.length);
		String name=student[index];
		//��ӡ����㵽������
		System.out.println(name);
	}
}

package JAVA;
import java.util.Scanner;
import java.util.Random;
public class CallName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------���������------");
		//����һ���洢����ͬѧ���ֵ�����
		//1.�洢ȫ��ͬѧ����
		//2.��ӡȫ��ͬѧÿһ���˵�����
		//3.��ȡ�����������ѧ������������ӡ
		String[] student = new String[3];//����һ���洢����ͬѧ���ֵ�����
		Scanner sc = new Scanner(System.in);
		//
		for(int i = 0 ; i < student.length ; i ++)
		{
			System.out.println("�洢��"+i+"�����ƣ�");
			student[i] = sc.next();//���̶�ȡ����ͬѧ�����ִ洢��������
			//System.out.println(student[i]);
		}
		//�������飬�õ�ÿ��ͬѧ������
		for( int i = 0 ; i < student.length ; i++)
		{
			System.out.println("��"+(i+1)+"��ѧ��������Ϊ��"+student[i]);
		}
		//�ڰ༶������Χ�ڣ�����һ�������
		//�������鳤�ȣ���ȡ�������
		int index = new Random().nextInt(student.length);
		//������ص㵽������
		String name = student[index];
		System.out.println("���㵽��ѧ������Ϊ��"+name);
	}
}

package Day5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class TestStudent2 {
/*1.�洢ȫ��ͬѧ��Ϣ�����������䣩
2.��ӡȫ��ͬѧÿһ���˵���Ϣ�����������䣩
3.�ڰ༶��������Χ�ڣ��������һ������������Ҹ����������Ӧ��ͬѧ��Ϣ�����������䣩����ӡ
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student2> list=new ArrayList<Student2>();
		addStudent(list);
		printStudent(list);
		randomStudent(list);
	}
	public static void addStudent(ArrayList<Student2> list)
	{
		//1.�洢ȫ��ͬѧ��Ϣ�����������䣩
		for(int i=0;i<2;i++)
		{
			Student2 s= new Student2();
			Scanner sc = new Scanner(System.in);
			System.out.println("�������"+(i+1)+"��ѧ����Ϣ��");
			System.out.println("������������");
			s.name=sc.next();
			System.out.println("���������䣺");
			s.age=sc.nextInt();
			list.add(s);
			System.out.println("�洢��"+(i+1)+"��ѧ����Ϣ��ɣ�");
		}
	}
	public static void printStudent(ArrayList<Student2> list)
	{
		//2.��ӡȫ��ͬѧÿһ���˵���Ϣ�����������䣩
		Student2 s= new Student2();
		for(int i=0;i<list.size();i++)
		{
			s=list.get(i);
			System.out.println("����       "+"����");
			System.out.println(s.name+"  "+s.age);
		}
	}
	public static void randomStudent(ArrayList<Student2> list)
	{
		int index=new Random().nextInt(list.size());
		Student2 s = new Student2();
		s = list.get(index);
		System.out.println("�����������ͬѧ:"+s.getName()+"����:"+s.getAge());
	}
}

package HomeWork;
import java.util.ArrayList;
import java.util.Scanner;
public class TestDay5Home4Student {
	/*
	 ����һ��ѧ����Student�����������������������䡢�Ա𣬴�������ѧ���������ArrayList�����С�
  A���������ϱ��������
  B�������������ѧ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Day5HomeWork4Student> student=new ArrayList<Day5HomeWork4Student>();
		addStudent(student);
		printStudent(student);
		maxAge(student);
	}
	public static void addStudent(ArrayList<Day5HomeWork4Student> student)
	{
		for(int i=0;i<2;i++)
		{
			//����ѧ������s
			Day5HomeWork4Student s=new Day5HomeWork4Student();
			Scanner sc=new Scanner(System.in);
			//��ʼ��ѧ������
			System.out.println("�������"+(i+1)+"��ѧ����Ϣ��");
			System.out.println("������ѧ��������");
			s.name=sc.next();
			System.out.println("������ѧ�����䣺");
			s.age=sc.nextInt();
			System.out.println("������ѧ���Ա�");
			s.sex=sc.next();
			student.add(s);
			System.out.println("�洢��"+(i+1)+"��ѧ����Ϣ���!");
		}
	}
	public static void printStudent(ArrayList<Day5HomeWork4Student> student)
	{
		for(int i=0;i<student.size();i++)
		{
			Day5HomeWork4Student s=student.get(i);
			System.out.println("��ӡ��"+(i+1)+"��ѧ����Ϣ��");
			System.out.println("������"+s.name+",���䣺"+s.age+",�Ա�"+s.sex);
		}
	}
	public static void maxAge(ArrayList<Day5HomeWork4Student> student)
	{
		int i=0;
		Day5HomeWork4Student s = student.get(i);
		for(i=0;i<student.size()-1;i++)
		{
			if(student.get(i+1).age>student.get(i).age)
			{
				s = student.get(i+1);
			}
		}
		System.out.println("��������ѧ����ϢΪ��"); 
		System.out.println("������"+s.name+",���䣺"+s.age+",�Ա�"+s.sex);
	}
}

package Day5;
/*���ǶԱ��������з������ó����·��������
1.�洢ȫ��ͬѧ��Ϣ�����������䣩
2.��ӡȫ��ͬѧÿһ���˵���Ϣ�����������䣩
3.�ڰ༶��������Χ�ڣ��������һ������������Ҹ����������Ӧ��ͬѧ��Ϣ�����������䣩
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class TestArrayListStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> student = new ArrayList<Student>(); //����һ�����Դ洢���ͬѧ���ֵ�����

		//1.�洢ȫ��ͬѧ��Ϣ
		addStudent(student);
		//2.��ӡȫ��ͬѧÿһ���˵���Ϣ�����������䣩
		printStudent(student);
		//3.�����ѧ����������ӡѧ����Ϣ
		randomStudent(student);
	}
	public static void addStudent(ArrayList<Student> student)
	{
		//1.�洢ȫ��ͬѧ��Ϣ
		//����������ѧ������Ϣ�洢��������
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			//����ѧ��
			Student s=new Student();
			System.out.println("�洢��"+(i+1)+"ѧ������:");
			s.name=sc.next();
			System.out.println("�洢��"+(i+1)+"ѧ������:");
			s.age=sc.nextInt();
			//���ѧ��������
			student.add(s);
		}
	}
	public static void printStudent(ArrayList<Student> student)
	{
		//2.��ӡȫ��ͬѧÿһ���˵���Ϣ�����������䣩
		for(int i=0;i<student.size();i++)
		{
			Student s=student.get(i);
			System.out.println("������"+s.name+",���䣺"+s.age);
		}
	}
	public static void randomStudent(ArrayList<Student> student)
	{
		//3.�����ѧ����������ӡѧ����Ϣ
		//int index = new Random().nextInt(student.size());
		Random r=new Random();
		int index = r.nextInt(student.size());
		Student s=student.get(index);
		System.out.println("���㵽��ѧ��������"+s.name+",���䣺"+s.age);
	}
}

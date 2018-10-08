package Day5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class TestStudent2 {
/*1.存储全班同学信息（姓名、年龄）
2.打印全班同学每一个人的信息（姓名、年龄）
3.在班级总人数范围内，随机产生一个随机数，查找该随机数所对应的同学信息（姓名、年龄）并打印
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
		//1.存储全班同学信息（姓名、年龄）
		for(int i=0;i<2;i++)
		{
			Student2 s= new Student2();
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第"+(i+1)+"个学生信息：");
			System.out.println("请输入姓名：");
			s.name=sc.next();
			System.out.println("请输入年龄：");
			s.age=sc.nextInt();
			list.add(s);
			System.out.println("存储第"+(i+1)+"个学生信息完成！");
		}
	}
	public static void printStudent(ArrayList<Student2> list)
	{
		//2.打印全班同学每一个人的信息（姓名、年龄）
		Student2 s= new Student2();
		for(int i=0;i<list.size();i++)
		{
			s=list.get(i);
			System.out.println("姓名       "+"年龄");
			System.out.println(s.name+"  "+s.age);
		}
	}
	public static void randomStudent(ArrayList<Student2> list)
	{
		int index=new Random().nextInt(list.size());
		Student2 s = new Student2();
		s = list.get(index);
		System.out.println("被随机点名的同学:"+s.getName()+"年龄:"+s.getAge());
	}
}

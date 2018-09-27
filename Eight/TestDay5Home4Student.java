package HomeWork;
import java.util.ArrayList;
import java.util.Scanner;
public class TestDay5Home4Student {
	/*
	 定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
  A：遍历集合遍历输出。
  B：求出年龄最大的学生
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
			//创建学生对象s
			Day5HomeWork4Student s=new Day5HomeWork4Student();
			Scanner sc=new Scanner(System.in);
			//初始化学生对象
			System.out.println("请输入第"+(i+1)+"个学生信息：");
			System.out.println("请输入学生姓名：");
			s.name=sc.next();
			System.out.println("请输入学生年龄：");
			s.age=sc.nextInt();
			System.out.println("请输入学生性别：");
			s.sex=sc.next();
			student.add(s);
			System.out.println("存储第"+(i+1)+"个学生信息完成!");
		}
	}
	public static void printStudent(ArrayList<Day5HomeWork4Student> student)
	{
		for(int i=0;i<student.size();i++)
		{
			Day5HomeWork4Student s=student.get(i);
			System.out.println("打印第"+(i+1)+"个学生信息：");
			System.out.println("姓名："+s.name+",年龄："+s.age+",性别："+s.sex);
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
		System.out.println("最大年龄的学生信息为："); 
		System.out.println("姓名："+s.name+",年龄："+s.age+",性别："+s.sex);
	}
}

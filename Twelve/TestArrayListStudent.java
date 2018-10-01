package Day5;
/*我们对本案例进行分析，得出如下分析结果：
1.存储全班同学信息（姓名、年龄）
2.打印全班同学每一个人的信息（姓名、年龄）
3.在班级总人数范围内，随机产生一个随机数，查找该随机数所对应的同学信息（姓名、年龄）
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class TestArrayListStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> student = new ArrayList<Student>(); //创建一个可以存储多个同学名字的容器

		//1.存储全班同学信息
		addStudent(student);
		//2.打印全班同学每一个人的信息（姓名、年龄）
		printStudent(student);
		//3.随机对学生点名，打印学生信息
		randomStudent(student);
	}
	public static void addStudent(ArrayList<Student> student)
	{
		//1.存储全班同学信息
		//键盘输入多个学生的信息存储到容器中
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			//创建学生
			Student s=new Student();
			System.out.println("存储第"+(i+1)+"学生姓名:");
			s.name=sc.next();
			System.out.println("存储第"+(i+1)+"学生年龄:");
			s.age=sc.nextInt();
			//添加学生到集合
			student.add(s);
		}
	}
	public static void printStudent(ArrayList<Student> student)
	{
		//2.打印全班同学每一个人的信息（姓名、年龄）
		for(int i=0;i<student.size();i++)
		{
			Student s=student.get(i);
			System.out.println("姓名："+s.name+",年龄："+s.age);
		}
	}
	public static void randomStudent(ArrayList<Student> student)
	{
		//3.随机对学生点名，打印学生信息
		//int index = new Random().nextInt(student.size());
		Random r=new Random();
		int index = r.nextInt(student.size());
		Student s=student.get(index);
		System.out.println("被点到的学生姓名："+s.name+",年龄："+s.age);
	}
}

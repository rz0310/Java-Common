package JAVA;
import java.util.Scanner;
import java.util.Random;
public class CallName2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.存储全班同学名字
//		2.打印全班同学每一个人的名字
//		3.在班级总人数范围内，随机产生一个随机数，查找该随机数所对应的同学名字
		String student[] = new String[3];//创建一个存储多名同学名字的容器(数组)
		addStudentName(student);//存储多名同学的名字
		printStudentName(student);//打印多名同学的名字
		randomStudentName(student);//随即被颠倒的同学的名字
	}
	public static void addStudentName(String student[])
	{
		//键盘输入多个名字存储倒容器中
		Scanner sc = new Scanner(System.in);
		for(int i=0 ;i<student.length;i++)
		{
			student[i] = sc.next();
			System.out.println("存储第"+(i+1)+"个学生名字:");
		}
	}
	public static void printStudentName(String student[])
	{
		for(int i=0;i<student.length;i++)
		{
			//遍历数组，得到每个同学的名字
			System.out.println("打印第"+(i+1)+"个学生名字:");
			String name=student[i];
			//打印名字
			System.out.println(name);
		}
	}
	public static void randomStudentName(String student[])
	{
		//根据数组长度，获取随机索引
		//int index=new Random().nextInt(student.length);
		Random ran=new Random();
		//通过随机索引从数组中获取名字
		int index=ran.nextInt(student.length);
		String name=student[index];
		//打印随机点到的名称
		System.out.println(name);
	}
}

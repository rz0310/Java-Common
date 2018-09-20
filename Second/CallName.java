package JAVA;
import java.util.Scanner;
import java.util.Random;
public class CallName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------随机点名器------");
		//创建一个存储多名同学名字的容器
		//1.存储全班同学名字
		//2.打印全班同学每一个人的名字
		//3.获取随机点名到的学生姓名，并打印
		String[] student = new String[3];//创建一个存储多名同学名字的容器
		Scanner sc = new Scanner(System.in);
		//
		for(int i = 0 ; i < student.length ; i ++)
		{
			System.out.println("存储第"+i+"个名称：");
			student[i] = sc.next();//键盘读取多名同学的名字存储到数组中
			//System.out.println(student[i]);
		}
		//遍历数组，得到每个同学的名字
		for( int i = 0 ; i < student.length ; i++)
		{
			System.out.println("第"+(i+1)+"个学生的姓名为："+student[i]);
		}
		//在班级人数范围内，产生一个随机数
		//根据数组长度，获取随机索引
		int index = new Random().nextInt(student.length);
		//随机返回点到的名字
		String name = student[index];
		System.out.println("被点到的学生名字为："+name);
	}
}

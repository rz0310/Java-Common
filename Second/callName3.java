package JAVA;
import java.util.Random;
public class callName3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义数组存储学生的姓名
		String [] names = new String[4];
		//调用添加学生姓名的方法
		addName(names);
		//调用遍历数组的方法
		printName(names);
		//调用随机姓名的方法
		randomStudentName(names);
	}
	public static void addName(String[] names)
	{
		names[0]="张聪";
		names[1]="任静静";
		names[2]="杨二傻";
		names[3]="大狗子";
	}
	public static void printName(String[] names)
	{
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}
	public static void randomStudentName(String[] names)
	{
		int index=new Random().nextInt(names.length);
		String name=names[index];
		System.out.println("产生给我作业的是："+name);
	}
}

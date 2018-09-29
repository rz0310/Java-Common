package HomeWork;

/*定义一个员工类Employee，包含三个属性姓名、工号、工资，创建三个员工对象存入ArrayList集合中，并遍历输出。
 	* public void add(int index,元素类型 e)在指定索引处向集合添加元素
	 *  public 元素类型 remove(int index)删除指定索引位置的元素
	 *  public 元素类型 set(int index,元素类型 e)修改指定索引位置的元素
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Worker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Day5HomeWork6Worker> worker = new ArrayList<Day5HomeWork6Worker>();
		newWorker(worker);
		printWorker(worker);
	}
	public static void newWorker(ArrayList<Day5HomeWork6Worker> worker)
	{
		for(int i=0;i<3;i++)
		{
			Day5HomeWork6Worker w=new Day5HomeWork6Worker();
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第"+(i+1)+"个员工的基本信息：");
			System.out.println("请输入姓名：");
			w.name=sc.next();
			System.out.println("请输入工号：");
			w.number=sc.nextInt();
			System.out.println("请输入工资：");
			w.salary=sc.nextDouble();
			worker.add(w);
			System.out.println("成功存储第"+(i+1)+"个员工的信息！");
		}
		/*public void add(int index,元素类型 e)在指定索引处向集合添加元素
		 *  public 元素类型 remove(int index)删除指定索引位置的元素
		 *  public 元素类型 set(int index,元素类型 e)修改指定索引位置的元素*/
		
		/*1.使用public void add(int index,元素类型 e)在指定索引处向集合添加元素
		Day5HomeWork6Worker w=new Day5HomeWork6Worker();
		w.name="xiaohua";
		w.number=1;
		w.salary=2018;
		worker.add(0, w);*/
		
		/*2.使用public 元素类型 remove(int index)删除指定索引位置的元素
		worker.remove(2);*/
		
		/* 3.使用public 元素类型 set(int index,元素类型 e)修改指定索引位置的元素
		Day5HomeWork6Worker w=new Day5HomeWork6Worker();
		w.name="xiaohua";
		w.number=3;
		w.salary=2018;
		worker.set(2, w);*/
	}
	public static void printWorker(ArrayList<Day5HomeWork6Worker> worker)
	{
		for(int i=0;i<worker.size();i++)
		{
			Day5HomeWork6Worker w=worker.get(i);
			System.out.println("----打印所有员工的基本信息----");
			System.out.println("姓名             工号            工资");
			System.out.println(w.name+"    "+w.number+"    "+w.salary);
		}
	}
}

package HomeWork;

/*����һ��Ա����Employee�����������������������š����ʣ���������Ա���������ArrayList�����У������������
 	* public void add(int index,Ԫ������ e)��ָ���������򼯺����Ԫ��
	 *  public Ԫ������ remove(int index)ɾ��ָ������λ�õ�Ԫ��
	 *  public Ԫ������ set(int index,Ԫ������ e)�޸�ָ������λ�õ�Ԫ��
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
			System.out.println("�������"+(i+1)+"��Ա���Ļ�����Ϣ��");
			System.out.println("������������");
			w.name=sc.next();
			System.out.println("�����빤�ţ�");
			w.number=sc.nextInt();
			System.out.println("�����빤�ʣ�");
			w.salary=sc.nextDouble();
			worker.add(w);
			System.out.println("�ɹ��洢��"+(i+1)+"��Ա������Ϣ��");
		}
		/*public void add(int index,Ԫ������ e)��ָ���������򼯺����Ԫ��
		 *  public Ԫ������ remove(int index)ɾ��ָ������λ�õ�Ԫ��
		 *  public Ԫ������ set(int index,Ԫ������ e)�޸�ָ������λ�õ�Ԫ��*/
		
		/*1.ʹ��public void add(int index,Ԫ������ e)��ָ���������򼯺����Ԫ��
		Day5HomeWork6Worker w=new Day5HomeWork6Worker();
		w.name="xiaohua";
		w.number=1;
		w.salary=2018;
		worker.add(0, w);*/
		
		/*2.ʹ��public Ԫ������ remove(int index)ɾ��ָ������λ�õ�Ԫ��
		worker.remove(2);*/
		
		/* 3.ʹ��public Ԫ������ set(int index,Ԫ������ e)�޸�ָ������λ�õ�Ԫ��
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
			System.out.println("----��ӡ����Ա���Ļ�����Ϣ----");
			System.out.println("����             ����            ����");
			System.out.println(w.name+"    "+w.number+"    "+w.salary);
		}
	}
}

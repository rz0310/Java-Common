package JAVA;
import java.util.Random;
public class callName3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������洢ѧ��������
		String [] names = new String[4];
		//�������ѧ�������ķ���
		addName(names);
		//���ñ�������ķ���
		printName(names);
		//������������ķ���
		randomStudentName(names);
	}
	public static void addName(String[] names)
	{
		names[0]="�Ŵ�";
		names[1]="�ξ���";
		names[2]="���ɵ";
		names[3]="����";
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
		System.out.println("����������ҵ���ǣ�"+name);
	}
}

package HomeWork;
/*����һ���ֻ���Phone��������������Ʒ��(brand)���۸�(price)����ɫ(color)��
�����ĸ��ֻ�("С��"��"��Ϊ"��"����"��"���")�������ArrayList�����У������������*/
import java.util.ArrayList;
import java.util.Scanner;
public class TestDay5HomeWork5Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Day5HomeWork5Phone> phone=new ArrayList<Day5HomeWork5Phone>();
		newPhone(phone);
		printPhone(phone);
	}
	public static void newPhone(ArrayList<Day5HomeWork5Phone> phone)
	{
		//�����ĸ��ֻ����뼯�϶���
		for(int i=0;i<4;i++)
		{
			//����һ���µ��ֻ�����
			Day5HomeWork5Phone p = new Day5HomeWork5Phone();
			Scanner sc = new Scanner(System.in);
			System.out.println("��������ֻ��Ļ�����Ϣ��");
			System.out.println("��������ֻ���Ʒ�ƣ�");
			p.brand = sc.next();
			System.out.println("��������ֻ��ļ۸�");
			p.price=sc.nextDouble();
			System.out.println("��������ֻ�����ɫ��");
			p.color=sc.next();
			phone.add(p);
			System.out.println("��"+(i+1)+"���ֻ��Ļ�����Ϣ�洢��ɣ�");
		}
	}
	public static void printPhone(ArrayList<Day5HomeWork5Phone> phone)
	{
		//��������ĸ��ֻ��Ļ�����Ϣ
		for(int i=0;i<phone.size();i++)
		{
			Day5HomeWork5Phone p = phone.get(i);
			System.out.println("--------��ӡ�ֻ�������Ϣ--------");
			System.out.println("Ʒ��      "+"�۸�       "+"��ɫ");
			System.out.println(p.brand+"  "+p.price+"  "+p.color);
		}
	}
}

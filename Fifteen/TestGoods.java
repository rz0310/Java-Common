package Day5;
import java.util.ArrayList;
import java.util.Scanner;
public class TestGoods {
/*-------------������------------
1.�鿴����嵥
2.�޸���Ʒ�������
3.�˳�
������Ҫִ�еĲ�����ţ�
 	ÿһ��ܲ��������ǲ��÷������з�װ����������ʹ����Ŀɶ�����ǿ��
ѡ��1.�鿴����嵥�����ܣ������̨��ӡ����嵥
ѡ��2.�޸���Ʒ������������ܣ����ÿ����Ʒ��������и���
ѡ��3.�˳������ܣ����˳��������������*/
	public static int chooseFunction()
	{
		//�������ܲ˵�
		System.out.println("-------������-------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		Scanner sc = new Scanner(System.in);
		//����Ա�������빦�ܲ������
		int choose = sc.nextInt();
		return choose;
	}
	public static void main(String[] args) {
		//����һ�����Դ洢���ֻ�������������ɿ����Ʒ��Ϣ
		ArrayList<Goods> good = new ArrayList<Goods>();
		//��ӿ����Ʒ��Ϣ
		addgood(good);
		//ͨ��whileѭ��ģ�����Ա���й����ظ�ѡ�����
		while(true)
		{
			int choose=chooseFunction();
			switch(choose)
			{
			case 1:
				//1.�鿴����嵥
				printScore(good);
				break;
			case 2:
				//2.�޸���Ʒ�������
				update(good);
				break;
			case 3:
				//3.�˳�
				exit();
				return;
			default:
				System.out.println("----------------------------------");
				System.out.println("����ѡ��������������ȷ�Ĺ������!");
				break;
			}
		}
	}
	public static void addgood(ArrayList<Goods> good)
	{
		//��ʼ���ÿ�����ϵͳ
		System.out.println("��Ϊ�òֿ���ӻ��");
		for(int n=0;n<2;n++)//n������������good.size(),good��δ����ʼ���������µõ���good.size()��0�����ܽ���ѭ��
		{
			Scanner sc = new Scanner(System.in);
			//ʵ����������Goods,�����»���g
			Goods g = new Goods();
			System.out.println("�洢��"+(n+1)+"���������Ϣ��");
			//Ʒ���ͺ�
			System.out.println("������Ʒ�ƣ�");
			g.brand=sc.next();
			//�ߴ��С
			System.out.println("������ߴ��С��");
			g.size=sc.nextDouble();
			//�۸�
			System.out.println("������۸�");
			g.price=sc.nextDouble();
			//�������
			System.out.println("��������������");
			g.amount=sc.nextInt();
			//��ӻ���g������good
			good.add(g);
		}
	}
	public static void printScore(ArrayList<Goods> good)
	{
		System.out.println("---------------------------�鿴����嵥--------------------------");
		System.out.println("Ʒ��       �ߴ��С	�۸�	�������");
		//��¼���������
		double sumAmount=0;
		//��¼ÿ����Ʒ���ܼ۸�
		double money=0;
		//��¼���л�����ܼ۸�
		double sumMoney=0;
		for(int i=0;i<good.size();i++)
		{
			//GoodsΪ�������gΪʵ�������µĻ���
			//goodΪ���϶���
			
			//�Ӽ�����ȡ���������
			Goods g=good.get(i);
			//��Ʒ������Ϊÿ����Ʒ����֮��
			sumAmount += g.amount;
			//ÿ����Ʒ�ܼ۸�Ϊ�۸�*����
			money = g.price * g.amount;
			//��Ʒ���ܼ۸�Ϊÿ����Ʒ�ļ۸�֮��
			sumMoney += money;
			System.out.println(g.brand+"  "+g.size+"    "+g.price+"     "+g.amount);
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("�ܿ������"+sumAmount); 
		System.out.println("�����Ʒ�ܽ�"+sumMoney);
	}
	public static void update(ArrayList<Goods> good)
	{
		System.out.println("------------�޸���Ʒ�������-----------");
		for(int i=0;i<good.size();i++)
		{
			//�Ӽ�����ȡ���������
			Goods g = good.get(i);
			System.out.println("�������"+g.brand+"Ʒ����Ʒ�������");
			g.amount = new Scanner(System.in).nextInt();
		}
	}
	public static void exit()
	{
		System.out.println("-------�˳�-------");
		System.out.println("-------���ѳɹ��˳�������ϵͳ--------");
	}
}

package HomeWork;
/*
 * �����������󣬲��ô���ʵ�֣�
	(1)���ݹ���(����)��Ա���ǹ���(����),����ͻ�������ͨ������¼��
	(2)�ǹ��ʵ��������£�
		[10-15)     +5000
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	(3)����û�����Ĺ���Ϊ10����������Ϊ3000���������к��ӡ��ʽ"��Ŀǰ������10�꣬��������Ϊ 3000Ԫ, Ӧ�ǹ��� 5000Ԫ,�Ǻ��� 8000Ԫ"
 */
import java.util.Scanner;
public class Day3HomeWork2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�����빫�䣺");
		int workAge = sc.nextInt();
		System.out.println("������������ʣ�");
		int basicSalary = sc.nextInt();
		int salary = basicSalary;
		if(workAge>=10&&workAge<15)
		{
			salary += 5000;
		}else if(workAge>=5&&workAge<10){
			salary += 2500;
		}else if(workAge>=3&&workAge<5){
			salary += 1000;
		}else if(workAge>=1&&workAge<3){
			salary += 500;
		}else if(workAge>=0&&workAge<1){
			salary += 200;
		}else{
			System.out.println("���ִ���");
		}
		System.out.println("��Ŀǰ������"+workAge+"�꣬��������Ϊ"+basicSalary+"Ԫ���Ǻ���Ϊ"+salary+"Ԫ");
	}

}

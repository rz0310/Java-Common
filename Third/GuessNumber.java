package JAVA;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//1.ͨ��Random���з���nextInt����������һ��1-100֮��������
			int randomNumber = new Random().nextInt(100);
			System.out.println("����������ɣ�");
			//2.����µ�����
			System.out.println("----���������µ����֣�----");
			Scanner sc = new Scanner(System.in);
			int enterNumber = sc.nextInt();
			//3.ͨ��whileѭ�������в����ֶԴ��ж�
			//�¶ԣ�����ѭ������Ϸ����
			while(enterNumber != randomNumber){
				//�´��ˣ����ݽ����������ʾ�����Ų����֣���Ϸ����
				if(enterNumber>randomNumber) { 
					//����´��ˣ���ӡsorry�����´���!������һ��ѭ��
					System.out.println("sorry�����´���!������һ��ѭ��");
				}else {
				//�����С�ˣ���ӡsorry������С��!������һ��ѭ��
					System.out.println("sorry������С��!������һ��ѭ��");
				}
				//����µ�����
				System.out.println("----���������µ����֣�----");
				enterNumber = sc.nextInt();
			}
				System.out.println("��ϲ��������ˣ�");
		}
	}


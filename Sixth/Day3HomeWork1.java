package HomeWork;
import java.util.Scanner;
public class Day3HomeWork1 {

	/*if���ʵ�ֿ��Գɼ��ֵȼ�(ʹ��switch���)��
	[90-100]	A�ȡ�
	[80-90) 	B�ȡ�
	[70-80) 	C�ȡ�
	[60-70) 	D�ȡ�
	[0-60)  	E�ȡ�
	����ݸ����ɼ��������Ӧ�ĵȼ���
	˵����"["��ʾ������")"��ʾ������*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		while(true)
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("������ɼ�:");
			int score=sc.nextInt();
			if(score>=90&&score<=100)
			{
				c = 'A';
				break;
			}else if(score>=80&score<90){
				c = 'B';
				break;
			}else if(score>=70&&score<80){
				c = 'C';
				break;
			}else if(score>=60&&score<70){
				c = 'D';
				break;
			} else if(score>=0&&score<60){
				c = 'E';
				break;
			}
			else{
				System.out.println("��ֵ������Χ�����������룡");
			}
		}
			switch(c)
			{
			case 'A':
				System.out.println("A��");
				break;
			case 'B':
				System.out.println("B��");
				break;
			case 'C':
				System.out.println("C��");
				break;
			case 'D':
				System.out.println("D��");
				break;
			case 'E':
				System.out.println("E��");
				break;
			default:
				System.out.println("���ִ���");
				break;
			}
	}

}

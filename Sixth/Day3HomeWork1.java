package HomeWork;
import java.util.Scanner;
public class Day3HomeWork1 {

	/*if语句实现考试成绩分等级(使用switch语句)。
	[90-100]	A等。
	[80-90) 	B等。
	[70-80) 	C等。
	[60-70) 	D等。
	[0-60)  	E等。
	请根据给定成绩，输出对应的等级。
	说明："["表示包含，")"表示不包含*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		while(true)
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入成绩:");
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
				System.out.println("数值超出范围，请重新输入！");
			}
		}
			switch(c)
			{
			case 'A':
				System.out.println("A等");
				break;
			case 'B':
				System.out.println("B等");
				break;
			case 'C':
				System.out.println("C等");
				break;
			case 'D':
				System.out.println("D等");
				break;
			case 'E':
				System.out.println("E等");
				break;
			default:
				System.out.println("出现错误！");
				break;
			}
	}

}

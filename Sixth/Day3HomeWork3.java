package HomeWork;
/*
 * 分析以下需求，并用代码实现：
	(1)键盘录入三个整数，按照从小到大的顺序输出
	(2)如果用户输入的是3 2 1，程序运行后打印格式"按照从小到大排序后的顺序为：1 2 3"
 */
import java.util.Scanner;
public class Day3HomeWork3 {

	/*
	 * 键盘录入三个整数，按照从小到大的顺序输出
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请连续输入三个数：");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max = num1;
		if(num2>num1)
		{
			max = num2;
			if(num3>num2)
			{
				max = num3;
			}
		}
		else if(num3 >num2)
		{
			max = num3;
		}
		System.out.println("max="+max);
	}
}

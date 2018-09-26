package HomeWork;

/*2.分析以下需求，并用代码实现：(封装成方法)
(1)打印1到100之内的整数，但数字中包含9的要跳过
(2)每行输出5个满足条件的数，之间用空格分隔
(3)如：
	1 2 3 4  5
	6 7 8 10 11*/
public class Day4HomeWork2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumber();
	}
	public static void printNumber()
	{
		//打印1到100之内的整数，但数字中包含9的要跳过
		System.out.println("打印1到100之内的整数，但数字中包含9的要跳过:");
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i % 9 == 0)
			{
				continue;
			}
			else
			{
				count++;
				System.out.print(i+" ");
				if(count % 5 == 0)
				{
					System.out.println();
				}
			}
		}
	}
}

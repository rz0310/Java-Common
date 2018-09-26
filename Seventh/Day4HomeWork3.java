package HomeWork;
/*分析以下需求，并用代码实现：(方法)
	(1)打印1-100之间的所有素数及个数
	(2)每行输出5个满足条件的数，之间用空格分隔
	注意：大于1的能被1和其本身整除的数叫素数。
	*/
public class Day4HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrimeNumber();
	}
	public static void printPrimeNumber()
	{
		int isPrime=1;
		int count=0;
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<i/2;j++)
			{
				if(i % j == 0)
				{
					isPrime=0;
					break;
				}
			}
			if(isPrime==1)
			{
				count++;
				System.out.print(i+" ");
				if(count % 5==0)
				{
					System.out.println();
				}
			}
			isPrime=1;
		}
	}
}

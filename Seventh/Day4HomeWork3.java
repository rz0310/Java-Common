package HomeWork;
/*�����������󣬲��ô���ʵ�֣�(����)
	(1)��ӡ1-100֮�����������������
	(2)ÿ�����5����������������֮���ÿո�ָ�
	ע�⣺����1���ܱ�1���䱾������������������
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

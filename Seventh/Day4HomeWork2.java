package HomeWork;

/*2.�����������󣬲��ô���ʵ�֣�(��װ�ɷ���)
(1)��ӡ1��100֮�ڵ��������������а���9��Ҫ����
(2)ÿ�����5����������������֮���ÿո�ָ�
(3)�磺
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
		//��ӡ1��100֮�ڵ��������������а���9��Ҫ����
		System.out.println("��ӡ1��100֮�ڵ��������������а���9��Ҫ����:");
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

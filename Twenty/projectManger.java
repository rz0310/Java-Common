package HomeWork;
/*
 * ������Ŀ������ 
			���ԣ����� ���� ���� ����
			��Ϊ������work(��ӡ���������š����ʡ�����)
 */
public class projectManger extends Employee{
	double prize;
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	//���影��ķ���
	public void prize()
	{
		System.out.println("��Ŀ����Ľ���");
	}
}

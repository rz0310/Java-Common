package lianxi24;
/*
 * ���� Employeet��
 */
public class Employee {
	//����˽�е�name����
	private String name;
	//������˽�е�month���ԣ�������ʹ��
	protected int month;
	//name��get����
	public String getName() {
		return name;
	}
	//name��set����
	public void setName(String name) {
		this.name = name;
	}
	//month��get����
	public int getMouth() {
		return month;
	}
	//month��set����
	public void setMouth(int mouth) {
		this.month = mouth;
	}
	//getSalary��������ȷ������
	public double getSalary(double salary,int month)
	{
		return 0;
	}
	public double getSalary(int month)
	{
		//��ʼ����Ϊ1000
		double salary =1000;
		//�����Ա�������գ�salary=salary+100
		if(this.month==month)
		{
			salary = salary+100;
		}
		return salary;
	}
	
}

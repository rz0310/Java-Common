package HomeWork;
 /*
 * ��������������´��루ֻ�ü̳У����ó����࣬���ձ�׼��ʽд�������ڲ������н��в��ԡ�
	����һ��
		��Ŀ������ 
			���ԣ����� ���� ���� ����
			��Ϊ������work(��ӡ���������š����ʡ�����)
		����Ա��
			���ԣ����� ���� ����
			��Ϊ������work(��ӡ���������š�����)
 */
/*
 * ����Ա����
 */
public class Employee {
	String name;
	String num;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//���幤���ķ���
	public void work()
	{
		System.out.println("���ھ��ľ����Ĺ�����");
	}
}

package lianxi24;
/*
 * ���� SalariedEmployeet��
 */
public class SalariedEmployee extends Employee {
	//����˽������salary
	private double salary;
	
	//salary��get����
	public double getSalary() {
		return salary;
	}
	//salary��set����
	public void setSalary(double salary,int month) {
		
		//�����Ա�������գ�salary=salary+100
		if(super.month==month)
		{
			salary = salary+100;
		}
		this.salary = salary;
	}
	
}

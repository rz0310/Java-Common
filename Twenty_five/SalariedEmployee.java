package lianxi24;
/*
 * 定义 SalariedEmployeet类
 */
public class SalariedEmployee extends Employee {
	//定义私有属性salary
	private double salary;
	
	//salary的get方法
	public double getSalary() {
		return salary;
	}
	//salary的set方法
	public void setSalary(double salary,int month) {
		
		//如果该员工过生日，salary=salary+100
		if(super.month==month)
		{
			salary = salary+100;
		}
		this.salary = salary;
	}
	
}

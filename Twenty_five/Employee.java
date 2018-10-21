package lianxi24;
/*
 * 定义 Employeet类
 */
public class Employee {
	//创建私有的name属性
	private String name;
	//创建非私有的month属性，供子类使用
	protected int month;
	//name的get方法
	public String getName() {
		return name;
	}
	//name的set方法
	public void setName(String name) {
		this.name = name;
	}
	//month的get方法
	public int getMouth() {
		return month;
	}
	//month的set方法
	public void setMouth(int mouth) {
		this.month = mouth;
	}
	//getSalary方法用来确定工资
	public double getSalary(double salary,int month)
	{
		return 0;
	}
	public double getSalary(int month)
	{
		//初始工资为1000
		double salary =1000;
		//如果该员工过生日，salary=salary+100
		if(this.month==month)
		{
			salary = salary+100;
		}
		return salary;
	}
	
}

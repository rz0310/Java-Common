package lianxi24;
/*
 * 定义 HourlyEmployeet类
 */
public class HourlyEmployee extends Employee {
	//定义私有属性hours
	private int hours;
	//定义私有属性hourlySalary
	private double hourlySalary;
	//hours的get方法
	public int getHours() {
		return hours;
	}
	//hours的set方法
	public void setHours(int hours) {
		this.hours = hours;
	}
	//HourlySalary的get方法
	public double getHourlySalary() {
		return hourlySalary;
	}
	//HourlySalary的set方法
	public void setHourlySalary(double hourlySalary) {
		//如果小时数大于160，超出的部分工资按1.5倍算
		if(hours>160)
		{
			hours = hours -160;
			hourlySalary = hourlySalary*160+(1.5*hourlySalary*hours);
		}
		this.hourlySalary = hourlySalary;
	}

}

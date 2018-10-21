package lianxi24;
/*
 * 定义 SalesEmployeet类
 */
public class SalesEmployee extends Employee {
	//定义私有属性sales
	private double sales;
	//定义非私有属性rate
	protected double rate;
	//sales的get方法
	public double getSales() {
		return sales;
	}
	//sales的set方法
	public void setSales(double sales) {
		this.sales = sales;
	}
	//rate的get方法
	public double getRate() {
		return rate;
	}
	//rate的set方法
	public void setRate(double rate) {
		this.rate = rate;
	}
	//getSalary方法
	public double getSalary(int month)
	{
		//工资由月销售额和提成率决定
		double salary = 1000;
		salary = salary + this.sales*rate;
		return salary;
	}

}

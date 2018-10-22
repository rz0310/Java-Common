package lianxi24;
/*
 * 定义 BasePlusSalesEmployeet类
 */
public class BasePlusSalesEmployee extends SalesEmployee {
	//定义私有属性baseSalary
	private double baseSalary;
	//baseSalary的get方法
	public double getBaseSalary() {
		return baseSalary;
	}
	//baseSalary的set方法
	public void setBaseSalary(double baseSalary) {
		baseSalary = baseSalary + baseSalary*super.rate;
		this.baseSalary = baseSalary;
	}
}

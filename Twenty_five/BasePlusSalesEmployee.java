package lianxi24;
/*
 * ���� BasePlusSalesEmployeet��
 */
public class BasePlusSalesEmployee extends SalesEmployee {
	//����˽������baseSalary
	private double baseSalary;
	//baseSalary��get����
	public double getBaseSalary() {
		return baseSalary;
	}
	//baseSalary��set����
	public void setBaseSalary(double baseSalary) {
		baseSalary = baseSalary + baseSalary*super.rate;
		this.baseSalary = baseSalary;
	}
}

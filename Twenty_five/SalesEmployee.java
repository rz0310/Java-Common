package lianxi24;
/*
 * ���� SalesEmployeet��
 */
public class SalesEmployee extends Employee {
	//����˽������sales
	private double sales;
	//�����˽������rate
	protected double rate;
	//sales��get����
	public double getSales() {
		return sales;
	}
	//sales��set����
	public void setSales(double sales) {
		this.sales = sales;
	}
	//rate��get����
	public double getRate() {
		return rate;
	}
	//rate��set����
	public void setRate(double rate) {
		this.rate = rate;
	}
	//getSalary����
	public double getSalary(int month)
	{
		//�����������۶������ʾ���
		double salary = 1000;
		salary = salary + this.sales*rate;
		return salary;
	}

}

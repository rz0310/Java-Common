package lianxi24;
/*
 * ���� HourlyEmployeet��
 */
public class HourlyEmployee extends Employee {
	//����˽������hours
	private int hours;
	//����˽������hourlySalary
	private double hourlySalary;
	//hours��get����
	public int getHours() {
		return hours;
	}
	//hours��set����
	public void setHours(int hours) {
		this.hours = hours;
	}
	//HourlySalary��get����
	public double getHourlySalary() {
		return hourlySalary;
	}
	//HourlySalary��set����
	public void setHourlySalary(double hourlySalary) {
		//���Сʱ������160�������Ĳ��ֹ��ʰ�1.5����
		if(hours>160)
		{
			hours = hours -160;
			hourlySalary = hourlySalary*160+(1.5*hourlySalary*hours);
		}
		this.hourlySalary = hourlySalary;
	}

}

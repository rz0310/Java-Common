package lianxi24;

public class Test {

	/*
	 * ���������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setMouth(10);
		e.getMouth();
		System.out.println("EmployeeԱ������ʱ����Ӻ�Ĺ���Ϊ��"+e.getSalary(10));
		System.out.println("��������ʱ����Ϊ��"+e.getSalary(11));
		
		SalariedEmployee s = new SalariedEmployee();
		s.setMouth(11);
		s.getMouth();
		s.setSalary(1500,10);
		System.out.println("SalariedEmployeeԱ���Ĺ���Ϊ��"+s.getSalary());
		
		HourlyEmployee h = new HourlyEmployee();
		h.setHours(170);
		h.getHours();
		h.setHourlySalary(10);
		System.out.println("HourlyEmployeeԱ���Ĺ���Ϊ��"+h.getHourlySalary());
		
		SalesEmployee s1 = new SalesEmployee();
		s1.setRate(0.05);
		s1.getRate();
		s1.setSales(100);
		s1.getSales();
		System.out.println("SalesEmployeeԱ���Ĺ���Ϊ��"+s1.getSalary(0));
		
		BasePlusSalesEmployee b = new BasePlusSalesEmployee();
		b.setRate(0.05);
		b.getRate();
		b.setBaseSalary(1200);
		System.out.println("BasePlusSalesEmployeeԱ���Ĺ���Ϊ��"+b.getBaseSalary());
	}

}

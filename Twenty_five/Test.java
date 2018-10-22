package lianxi24;

public class Test {

	/*
	 * 定义测试类
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setMouth(10);
		e.getMouth();
		System.out.println("Employee员工生日时额外加后的工资为："+e.getSalary(10));
		System.out.println("不是生日时工资为："+e.getSalary(11));
		
		SalariedEmployee s = new SalariedEmployee();
		s.setMouth(11);
		s.getMouth();
		s.setSalary(1500,10);
		System.out.println("SalariedEmployee员工的工资为："+s.getSalary());
		
		HourlyEmployee h = new HourlyEmployee();
		h.setHours(170);
		h.getHours();
		h.setHourlySalary(10);
		System.out.println("HourlyEmployee员工的工资为："+h.getHourlySalary());
		
		SalesEmployee s1 = new SalesEmployee();
		s1.setRate(0.05);
		s1.getRate();
		s1.setSales(100);
		s1.getSales();
		System.out.println("SalesEmployee员工的工资为："+s1.getSalary(0));
		
		BasePlusSalesEmployee b = new BasePlusSalesEmployee();
		b.setRate(0.05);
		b.getRate();
		b.setBaseSalary(1200);
		System.out.println("BasePlusSalesEmployee员工的工资为："+b.getBaseSalary());
	}

}

package lianxi24;
import java.util.ArrayList;
public class Test1 {

	/*
	 * 定义测试类
	 */
	public static void main(String[] args) {
		//创建集合保存Employee对象
		ArrayList<Employee> list = new ArrayList<Employee>();
		//使用多态创建对象，Employee的引用变量指向SalariedEmployee对象
		Employee e1 = new SalariedEmployee();
		//使用多态创建对象，Employee的引用变量指向HourlyEmployee对象
		Employee e2 = new HourlyEmployee();
		//使用多态创建对象，Employee的引用变量指向SalesEmployee对象
		Employee e3 = new SalesEmployee();
		//使用多态创建对象，Employee的引用变量指向BasePlusSalesEmployee对象
		Employee e4 = new BasePlusSalesEmployee();
	}

}

package lianxi24;
import java.util.ArrayList;
public class Test1 {

	/*
	 * ���������
	 */
	public static void main(String[] args) {
		//�������ϱ���Employee����
		ArrayList<Employee> list = new ArrayList<Employee>();
		//ʹ�ö�̬��������Employee�����ñ���ָ��SalariedEmployee����
		Employee e1 = new SalariedEmployee();
		//ʹ�ö�̬��������Employee�����ñ���ָ��HourlyEmployee����
		Employee e2 = new HourlyEmployee();
		//ʹ�ö�̬��������Employee�����ñ���ָ��SalesEmployee����
		Employee e3 = new SalesEmployee();
		//ʹ�ö�̬��������Employee�����ñ���ָ��BasePlusSalesEmployee����
		Employee e4 = new BasePlusSalesEmployee();
	}

}

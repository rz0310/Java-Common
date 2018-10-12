package HomeWork;
 /*
 * 根据需求，完成如下代码（只用继承，不用抽象类，按照标准格式写），并在测试类中进行测试。
	需求一：
		项目经理类 
			属性：姓名 工号 工资 奖金
			行为：工作work(打印姓名、工号、工资、奖金)
		程序员类
			属性：姓名 工号 工资
			行为：工作work(打印姓名、工号、工资)
 */
/*
 * 定义员工类
 */
public class Employee {
	String name;
	String num;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//定义工作的方法
	public void work()
	{
		System.out.println("正在尽心尽力的工作！");
	}
}

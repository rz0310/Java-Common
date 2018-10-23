package www.Oracle.com;

public class Worker {
	//初始化成员变量
	private String name;
	private int age;
	private double salary;
	private Address addr;
	//无参构造方法
	public Worker() {
		super();
	}
	//带参构造函数
	public Worker(String nm,int a,double sa,Address ad)
	{
		name = nm;
		age = a;
		salary = sa;
		addr = ad;
	}
	//成员变量的get()和set()方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	//无参的work()方法
	public void work()
	{
		System.out.println("工人姓名为"+this.getName()+",年龄为"+this.getAge()+"的工人正在工作。");
	}
	//带参的work()方法
	public void work(int hour)
	{
		this.salary = this.salary * hour;
		System.out.println("工作时间为"+hour+"小时,工资为"+this.getSalary());
	}
	
}

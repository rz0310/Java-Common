package www.Oracle.com;

public class Worker {
	//��ʼ����Ա����
	private String name;
	private int age;
	private double salary;
	private Address addr;
	//�޲ι��췽��
	public Worker() {
		super();
	}
	//���ι��캯��
	public Worker(String nm,int a,double sa,Address ad)
	{
		name = nm;
		age = a;
		salary = sa;
		addr = ad;
	}
	//��Ա������get()��set()����
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
	//�޲ε�work()����
	public void work()
	{
		System.out.println("��������Ϊ"+this.getName()+",����Ϊ"+this.getAge()+"�Ĺ������ڹ�����");
	}
	//���ε�work()����
	public void work(int hour)
	{
		this.salary = this.salary * hour;
		System.out.println("����ʱ��Ϊ"+hour+"Сʱ,����Ϊ"+this.getSalary());
	}
	
}

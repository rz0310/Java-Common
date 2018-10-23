package www.Oracle.com;

public class Test {

	/*
	 * 定义测试类
	 */
	public static void main(String[] args) {
		/*Worker w = new Worker("李四",22,100);
		w.work();
		w.work(2);
		Address a = new Address("陕西省延安市志丹县","717500");
		System.out.println("地址为："+a.getAddress()+"  邮编为"+a.getZipCode());*/
		Address a2 = new Address("北京市海淀区清华园1号","100084");
		Worker w1 = new Worker("张三",25,2500,a2);
		System.out.println("姓名："+w1.getName()+" 年龄："+w1.getAge()+" 工资："+w1.getSalary());
		System.out.println("地址："+w1.getAddr().getAddress()+"  邮编："+a2.getZipCode());
		//System.out.println("地址："+a2.getAddress()+"  邮编："+a2.getZipCode());
	}

}

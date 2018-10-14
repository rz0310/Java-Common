package HomeWork;
/*
 * 定义测试类
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建projectManger对象p
		projectManger p = new projectManger();
		//给各属性赋值
		p.name="任静";
		p.num="PM001";
		p.prize=2000;
		p.salary=10000;
		System.out.println("姓名为："+p.name+" 工号为："+p.num+"的项目经理的工资为："+p.salary+" 奖金为："+p.prize);
		//调用工作的方法
		p.work();
		//创建Programmer对象Pg
		Programmer Pg = new Programmer();
		//给各属性赋值
		Pg.name="张三";
		Pg.num="IT001";
		Pg.salary=8000;
		System.out.println("姓名为："+Pg.name+" 工号为："+Pg.num+"的程序员的工资为："+Pg.salary);
		//调用工作的方法
		Pg.work();
		//创建Teacher对象t
		Teacher t = new Teacher();
		//给各赋值赋值
		t.name="李四";
		t.age=20;
		System.out.print("姓名为："+t.name+" 年龄为："+t.age+"的");
		//调用teach方法
		t.teach();
		//创建Student对象s
		Student s = new Student();
		//给各属性赋值
		s.name="王五";
		s.age=21;
		System.out.print("姓名为："+s.name+" 年龄为："+s.age+"的");
		//调用学习方法
		s.learn();
	}

}

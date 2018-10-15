package HomeWork2;
/*
 * 定义测试类
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建BasicTeacher对象b
		BasicTeacher b = new BasicTeacher();
		//给各属性赋值
		b.name="张三";
		b.age=24;
		System.out.print("姓名为"+b.name+" 年龄为："+b.age+"的");
		//调用重写的teach方法
		b.teach();
		//创建AppTeacher对象a
		AppTeacher a = new AppTeacher();
		//给各属性赋值
		a.name="李四";
		a.age=23;
		System.out.print("姓名为"+a.name+" 年龄为："+a.age+"的");
		//调用重写的teach方法
		a.teach();
	}
}

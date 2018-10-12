package HomeWork;
/*
 * 需求二：
		已知学生类和老师类如下：
			属性:姓名,年龄
			行为:吃饭
			老师有特有的方法:讲课
			学生有特有的方法:学习
 */
public class People {
	String name;
	int age;
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
	//定义吃饭的方法
	public void eat()
	{
		System.out.println("正在吃饭");
	}
}

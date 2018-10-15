package HomeWork2;
/*
 * 根据需求，完成如下代码（使用抽象类、按照标准格式写），并在测试类中进行测试。
	需求：
		具体事物：基础班老师，APP班老师
		共性：姓名，年龄，讲课。
		特性：
			基础班老师讲JavaSE
			APP班老师讲Android
 */
/*
 * 定义抽象类老师类
 */
public abstract class Teacher {
	String name;
	int age;
	//声明讲课的方法
	public abstract void teach();
}

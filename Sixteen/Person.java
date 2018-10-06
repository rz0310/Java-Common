package Day5;

public class Person {

	private int age;
	private String name;

	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public boolean equalAge(Person p)
	{
		//使用当前调用该equalsAge方法的对象的age和传递进来p的age进行比较
		//由于无法确定具体是哪一个对象调用equalsAge方法，这里就可以使用this来代替
		/*
		 * if(this.age == p.age) { return true; } return false;
		 */
		return this.age==p.age;
	}
}

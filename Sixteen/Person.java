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
		//ʹ�õ�ǰ���ø�equalsAge�����Ķ����age�ʹ��ݽ���p��age���бȽ�
		//�����޷�ȷ����������һ���������equalsAge����������Ϳ���ʹ��this������
		/*
		 * if(this.age == p.age) { return true; } return false;
		 */
		return this.age==p.age;
	}
}

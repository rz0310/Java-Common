package Day5;

public class PersonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建person对象p
		Person p = new Person();
		p.setAge(20);
		System.out.println(p.getAge());
		
		p.setName("xiaohua");
		System.out.println(p.getName());
		
		System.out.println(p.equalAge(p));
	}

}

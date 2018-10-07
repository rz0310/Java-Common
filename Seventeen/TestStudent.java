package Day5;

public class TestStudent {

	//学生，包含属性（姓名，年龄，性别等）
	public static void main(String[] args) {
		Student s = new Student();
		s.name="任静";
		s.age=20;
		s.sex="女";
		
		System.out.println("姓名："+s.name);
		System.out.println("年龄："+s.age);
		System.out.println("性别："+s.sex);
		
		Student s1=new Student();
		s1.name="张聪";
		s1.age=20;
		s1.sex="男";
		
		System.out.println("姓名："+s1.name);
		System.out.println("年龄："+s1.age);
		System.out.println("性别："+s1.sex);
	}

}

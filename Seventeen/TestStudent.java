package Day5;

public class TestStudent {

	//ѧ�����������ԣ����������䣬�Ա�ȣ�
	public static void main(String[] args) {
		Student s = new Student();
		s.name="�ξ�";
		s.age=20;
		s.sex="Ů";
		
		System.out.println("������"+s.name);
		System.out.println("���䣺"+s.age);
		System.out.println("�Ա�"+s.sex);
		
		Student s1=new Student();
		s1.name="�Ŵ�";
		s1.age=20;
		s1.sex="��";
		
		System.out.println("������"+s1.name);
		System.out.println("���䣺"+s1.age);
		System.out.println("�Ա�"+s1.sex);
	}

}

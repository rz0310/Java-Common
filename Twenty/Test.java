package HomeWork;
/*
 * ���������
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����projectManger����p
		projectManger p = new projectManger();
		//�������Ը�ֵ
		p.name="�ξ�";
		p.num="PM001";
		p.prize=2000;
		p.salary=10000;
		System.out.println("����Ϊ��"+p.name+" ����Ϊ��"+p.num+"����Ŀ����Ĺ���Ϊ��"+p.salary+" ����Ϊ��"+p.prize);
		//���ù����ķ���
		p.work();
		//����Programmer����Pg
		Programmer Pg = new Programmer();
		//�������Ը�ֵ
		Pg.name="����";
		Pg.num="IT001";
		Pg.salary=8000;
		System.out.println("����Ϊ��"+Pg.name+" ����Ϊ��"+Pg.num+"�ĳ���Ա�Ĺ���Ϊ��"+Pg.salary);
		//���ù����ķ���
		Pg.work();
		//����Teacher����t
		Teacher t = new Teacher();
		//������ֵ��ֵ
		t.name="����";
		t.age=20;
		System.out.print("����Ϊ��"+t.name+" ����Ϊ��"+t.age+"��");
		//����teach����
		t.teach();
		//����Student����s
		Student s = new Student();
		//�������Ը�ֵ
		s.name="����";
		s.age=21;
		System.out.print("����Ϊ��"+s.name+" ����Ϊ��"+s.age+"��");
		//����ѧϰ����
		s.learn();
	}

}

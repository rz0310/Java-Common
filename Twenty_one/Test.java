package HomeWork2;
/*
 * ���������
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����BasicTeacher����b
		BasicTeacher b = new BasicTeacher();
		//�������Ը�ֵ
		b.name="����";
		b.age=24;
		System.out.print("����Ϊ"+b.name+" ����Ϊ��"+b.age+"��");
		//������д��teach����
		b.teach();
		//����AppTeacher����a
		AppTeacher a = new AppTeacher();
		//�������Ը�ֵ
		a.name="����";
		a.age=23;
		System.out.print("����Ϊ"+a.name+" ����Ϊ��"+a.age+"��");
		//������д��teach����
		a.teach();
	}
}

package www.Oracle.com;

public class Test {

	/*
	 * ���������
	 */
	public static void main(String[] args) {
		/*Worker w = new Worker("����",22,100);
		w.work();
		w.work(2);
		Address a = new Address("����ʡ�Ӱ���־����","717500");
		System.out.println("��ַΪ��"+a.getAddress()+"  �ʱ�Ϊ"+a.getZipCode());*/
		Address a2 = new Address("�����к������廪԰1��","100084");
		Worker w1 = new Worker("����",25,2500,a2);
		System.out.println("������"+w1.getName()+" ���䣺"+w1.getAge()+" ���ʣ�"+w1.getSalary());
		System.out.println("��ַ��"+w1.getAddr().getAddress()+"  �ʱࣺ"+a2.getZipCode());
		//System.out.println("��ַ��"+a2.getAddress()+"  �ʱࣺ"+a2.getZipCode());
	}

}

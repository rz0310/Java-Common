package Employee;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEE j = new JavaEE();
		j.setId("IT001");
		j.getId();
		j.setName("����");
		j.getName();
		j.work();
		Android a = new Android();
		a.setId("IT002");
		a.getId();
		a.setName("����");
		a.getName();
		a.work();
		NetWork n = new NetWork();
		n.setId("IT003");
		n.getId();
		n.setName("�Ŵ�");
		n.getName();
		n.work();
		HardWork h = new HardWork();
		h.setId("IT004");
		h.getId();
		h.setName("�ξ�");
		h.getName();
		h.work();
	}

}

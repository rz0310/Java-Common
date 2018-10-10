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
		j.setName("张三");
		j.getName();
		j.work();
		Android a = new Android();
		a.setId("IT002");
		a.getId();
		a.setName("李四");
		a.getName();
		a.work();
		NetWork n = new NetWork();
		n.setId("IT003");
		n.getId();
		n.setName("张聪");
		n.getName();
		n.work();
		HardWork h = new HardWork();
		h.setId("IT004");
		h.getId();
		h.setName("任静");
		h.getName();
		h.work();
	}

}

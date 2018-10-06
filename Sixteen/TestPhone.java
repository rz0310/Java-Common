package Day5;

public class TestPhone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义了一个phone类型的变量
		Phone p = new Phone();
		//通过p访问的phone属性
		p.brand="苹果5s";//访问p中的brand属性
		p.color="red";//访问p中的color属性
		p.sizes=15.6;//访问p中的sizes属性
		System.out.println("brand="+p.brand);
		System.out.println("brand="+p.color);
		System.out.println("brand="+p.sizes);
	}

}

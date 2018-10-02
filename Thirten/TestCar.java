package Day5;

public class TestCar {

	//汽车，包含属性（品牌、排量、类型等）
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.brand="bengchi";
		c.displacement=155;
		c.kind="dazhong";
		System.out.println("品牌："+c.brand);
		System.out.println("排量："+c.displacement);
		System.out.println("类型："+c.kind);
	}

}

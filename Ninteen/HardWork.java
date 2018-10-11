package Employee;

public class HardWork extends Maintainer{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("编号为:"+super.getId()+"  姓名为:"+super.getName()+"的硬件维护工程师正在进行硬件维护");
	}
}

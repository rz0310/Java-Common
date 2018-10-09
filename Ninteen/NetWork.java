package Employee;

public class NetWork extends Maintainer{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("编号为:"+super.getId()+"  姓名为:"+super.getName()+"的网络维护工程师正在进行网络维护");
	}
}

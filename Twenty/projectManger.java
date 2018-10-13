package HomeWork;
/*
 * 定义项目经理类 
			属性：姓名 工号 工资 奖金
			行为：工作work(打印姓名、工号、工资、奖金)
 */
public class projectManger extends Employee{
	double prize;
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	//定义奖金的方法
	public void prize()
	{
		System.out.println("项目经理的奖金");
	}
}

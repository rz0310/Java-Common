package HomeWork;
/*
 * 分析以下需求，并用代码实现：
	(1)根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
	(2)涨工资的条件如下：
		[10-15)     +5000
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	(3)如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
 */
import java.util.Scanner;
public class Day3HomeWork2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入公龄：");
		int workAge = sc.nextInt();
		System.out.println("请输入基本工资：");
		int basicSalary = sc.nextInt();
		int salary = basicSalary;
		if(workAge>=10&&workAge<15)
		{
			salary += 5000;
		}else if(workAge>=5&&workAge<10){
			salary += 2500;
		}else if(workAge>=3&&workAge<5){
			salary += 1000;
		}else if(workAge>=1&&workAge<3){
			salary += 500;
		}else if(workAge>=0&&workAge<1){
			salary += 200;
		}else{
			System.out.println("出现错误！");
		}
		System.out.println("您目前工作了"+workAge+"年，基本工资为"+basicSalary+"元，涨后工资为"+salary+"元");
	}

}

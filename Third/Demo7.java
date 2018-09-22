package JAVA;
import java.util.Scanner;
public class Demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		System.out.println(str[new Scanner(System.in).nextInt()-1]);
	}

}

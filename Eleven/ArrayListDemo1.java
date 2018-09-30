package Day5;
import java.util.ArrayList;
public class ArrayListDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合
		ArrayList<String> list=new ArrayList<String>();
		//向集合中添加元素
		list.add("lll");
		list.add("rrr");
		list.add("aaa");
		//获取集合中元素的个数
		System.out.println(""+list.size());
		//取出并打印指定位置的元素
		System.out.println(""+list.get(0));
		System.out.println(""+list.get(1));
		System.out.println(""+list.get(2));
	}

}

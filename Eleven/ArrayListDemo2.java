package Day5;
import java.util.ArrayList;
public class ArrayListDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		//向集合中添加元素
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//遍历输出
		for(int i=0;i<list.size();i++)
		{
			//通过索引，获取集合中的每个元素
			int n=list.get(i);//get方法返回值的类型为集合中元素的类型
			System.out.println(n);
		}
	}

}

package Day5;
import java.util.ArrayList;
public class ArrayListDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		//�򼯺������Ԫ��
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//�������
		for(int i=0;i<list.size();i++)
		{
			//ͨ����������ȡ�����е�ÿ��Ԫ��
			int n=list.get(i);//get��������ֵ������Ϊ������Ԫ�ص�����
			System.out.println(n);
		}
	}

}

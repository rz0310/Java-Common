package Day5;
import java.util.ArrayList;
public class ArrayListDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		ArrayList<String> list=new ArrayList<String>();
		//�򼯺������Ԫ��
		list.add("lll");
		list.add("rrr");
		list.add("aaa");
		//��ȡ������Ԫ�صĸ���
		System.out.println(""+list.size());
		//ȡ������ӡָ��λ�õ�Ԫ��
		System.out.println(""+list.get(0));
		System.out.println(""+list.get(1));
		System.out.println(""+list.get(2));
	}

}

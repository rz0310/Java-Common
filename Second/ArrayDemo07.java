package JAVA;

public class ArrayDemo07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ά����ķ�ʽ
		int [][] arr = new int[3][4];
		//�����ά����ĵ�ַ
		System.out.println(arr);
		System.out.println("��ά����ĳ��ȣ�"+arr.length);
		//��ȡ��ά���������Ԫ��
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("��ӡ��һ��һά�����Ԫ��ֵ");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		System.out.println("��ӡ�ڶ���һά�����Ԫ��ֵ");
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[1][3]);
		System.out.println("��ӡ������һά�����Ԫ��ֵ");
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		System.out.println(arr[2][3]);
	}

}

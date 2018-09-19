package JAVA;

public class ArrayDemo08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][];//定义一个长度为3的二维数组
		int sum=0;//定义变量记录总销售额
		arr[0]=new int[]{11,12};//为数组的元素赋值
		arr[1]=new int[]{21,22,23};
		arr[2]=new int[]{31,32,33,34};
		for(int i=0;i<arr.length;i++)//遍历数组元素
		{
			int groupsum=0;//定义变量记录小组总销售额
			for(int j=0;j<arr[i].length;j++)//遍历小组每个人的销售额
			{
				groupsum += arr[i][j];//每个小组的销售额
			}
			sum += groupsum;//累加小组销售额
			System.out.println("第"+(i+1)+"个小组的销售额为："+groupsum+"万元");
		}
		System.out.println("总的销售额为："+sum+"万元");
	}

}

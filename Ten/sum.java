package HomeWork;
/*
 * 公司年销售额求和
		某公司按照季度和月份统计的数据如下：单位(万元)
		第一季度：22,66,44
		第二季度：77,33,88
		第三季度：25,45,65
		第四季度：11,66,99
 */
public class sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义二维数组
		int sum[][] = new int[][]{{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int count=0;//记录和
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				//求和
				count += sum[i][j]; 
			}
		}
		System.out.println("公司年度销售总额为:"+count+"万元");
	}

}

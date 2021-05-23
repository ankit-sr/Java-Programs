class Rowsum
{
	public static void main(String[] args)
	{
		int[][] a= {{10,20,30},{40,50,60}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println(sum);
		}
		
	}
}
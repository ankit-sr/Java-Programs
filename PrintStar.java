class PrintStar
{
	public static void main(String[] args)
	{
		int i=1,j=0;
		while(i<=5)
		{
			j=1;
			while(j<=5)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
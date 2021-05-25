class StarSpace
{
	public static void main(String[] args)
	{
		int i=5,j=0,s=0;
		while(i>=1)
		{
			s=1;
			while(s<i)
			{
				System.out.print(" ");
				s++;
			}
			j=1;
			while(j<=5)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
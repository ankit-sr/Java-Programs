class ArrayMax
{
	public static void main(String[] args)
	{
		int a[]={12,2,35,66,94,5,13,88};
		int max =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max);
	}
}
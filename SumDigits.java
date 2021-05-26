class SumDigits
{
	public static void main(String[] args)
	{
		int num=548;
		if(num<=9)
		{
			System.out.println("ERROR-009");
		}
		else
		{
			int last=num%10;
			while(num>9)
			{
				num=num/10;
			}
			System.out.println(num+last);
		}
	}
}

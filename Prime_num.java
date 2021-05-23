import java.util.Scanner;
class Prime_num
{
	public static void main(String[] args)
	{
		int num, i=2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		if(num==1)
			System.out.println("Number is not prime.");
		else
		{
			System.out.println("Primes are : ");
			for(int j=2;j<=num;j++)
			{
				i=2;
				while((j%i)!=0)
				{
					i++;
				}
				if(j==i)
					System.out.println(j);
			}
		}
	}
}
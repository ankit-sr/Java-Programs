import java.util.Scanner;
class Prime
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
			while((num%i)!=0)
			{
				i++;
			}
			if(num==i)
			{
				System.out.println("Number is prime.");
			}
			else
				System.out.println("Number is not prime.");
		}
	}
}
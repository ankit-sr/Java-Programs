import java.util.Scanner;
class Sumfirstlast
{
	public static void main(String[] args)
	{
		int num,first,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		first=num%10;
		while(num>=10)
		{
			num=num/10;
		}
		sum=num+first;
		System.out.println("Sum of firs and last digit is : " + sum);
	}
}
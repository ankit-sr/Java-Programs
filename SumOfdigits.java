import java.util.Scanner;
class SumOfdigits
{
	public static void main(String[] args)
	{
		int num,sum=0,temp;;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		while(num!=0)
		{
			temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		System.out.println("Sum of Digits = "+ sum);
	}
}
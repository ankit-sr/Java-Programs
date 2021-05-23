import java.util.Scanner;
class Productofdigits
{
	public static void main(String[] args)
	{
		int num,product=1,temp;;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		while(num!=0)
		{
			temp=num%10;
			product=product*temp;
			num=num/10;
		}
		System.out.println("Product of Digits = "+ product);
	}
}
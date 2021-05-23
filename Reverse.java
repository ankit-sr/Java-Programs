import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		int num,rev=0,temp;;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		while(num!=0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println("Reverse of the number is : "+ rev);
	}
}
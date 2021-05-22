import java.util.Scanner;
class Firstlast
{
	public static void main(String[] args)
	{
		int num,first;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=obj.nextInt();
		first=num%10;
		while(num>=10)
		{
			num=num/10;
		}
		System.out.println("First digit is : "+ num);
		System.out.println("Last digit is :"+ last);
	}
}
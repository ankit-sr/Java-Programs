import java.util.Scanner;
class Swapfirstlast
{
	public static void main(String[] args)
	{
		int num,last,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		last=num%10;
		while(num>=10)
		{
			num=num/10;
		}
		System.out.println("Before Swap : \nFirst digit is : "+ num);
		System.out.println("Last digit is :"+last);
		temp=num;
		num=last;
		last = temp;
		System.out.println("After Swap : \nFirst digit is : "+ num);
		System.out.println("Last digit is :"+last);
	}
}
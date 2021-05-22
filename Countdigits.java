import java.util.Scanner;
class Countdigits
{
	public static void main(String[] args)
	{
		int num,count=0;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println("Number of Digits = "+ count);
	}
}
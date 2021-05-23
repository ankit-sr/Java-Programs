import java.util.Scanner;
class Maximum
{
	public static void main(String[] args)
	{
		int a,b;
		boolean max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		switch(int(a>b))
		{
			case 0 :
				System.out.println(a+"is greater than "+b);
				break;
			case 1 : 
				System.out.println(b+"is greater than "+a);
				break;
		}
		
	}
}
import java.util.Scanner;
class SumofArray
{
	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter : ");
		n=sc.nextInt();	
		int[] a =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum = "+sum);
	}
}
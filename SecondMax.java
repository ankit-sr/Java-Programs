import java.util.Scanner;
class SecondMax
{
	public static void main(String[] args)
	{
		int n,i,max=0,secmax=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values you want to enter : ");
		n=sc.nextInt();
		int[] a = new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		max=a[0];
		secmax=a[0];
		for(i=0;i<n;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		for(i=0;i<n;i++)
		{
			if(secmax<a[i] && a[i]!=max)
				secmax=a[i];
		}
		System.out.println("The second largest value in the given array is " + secmax);
	}
}
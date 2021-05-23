import java.util.Scanner;
class MaxProduct
{
	public static void main(String[] args)
	{
		int n,i,max=0,secmax=0,prod;
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
		prod = max * secmax;
		System.out.println("Maximu product for the value presect in the array is "+ prod);
	}
}
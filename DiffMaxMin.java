import java.util.Scanner;
class DiffMaxMin
{
	public static void main(String[] args)
	{
		int n,i,max=0,min=0,diff;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values you want to enter : ");
		n=sc.nextInt();
		int[] a = new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		max=a[0];
		min=a[0];
		for(i=0;i<n;i++)
		{
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		diff = max - min;
		System.out.println("Maximum value in the array is "+ max);
		System.out.println("Minimum value in the array is "+ min);
		System.out.println("Difference between maximum and minimum value in the array is "+ diff);
	}
}
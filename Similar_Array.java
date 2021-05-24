import java.util.Scanner;
class Similar_Array
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter : ");
		n=sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		System.out.println("Enter values for array 1 : ");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter values for array 2 : ");
		for(i=0;i<n;i++)
			b[i]=sc.nextInt();
		System.out.println("Common numbers in the arrays are : ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]==b[j])
					System.out.println(a[i]);
			}
		}
	}
}
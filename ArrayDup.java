import java.util.Scanner;
class ArrayDup
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter : ");
		n=sc.nextInt();
		int[] a = new int[n];
		int b[] = new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Duplicate numbers in the given array are : ");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
					System.out.println(a[i]);
			}
		}
	}
}
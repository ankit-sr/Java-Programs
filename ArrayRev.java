import java.util.Scanner;
class ArrayDup
{
	public static void main(String[] args)
	{
		int n,i,j,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values you want to enter : ");		
		n = sc.nextInt();
		int[] a = new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Before Reversal : ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0,j=n-1; i<n/2; i++)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
		}
		System.out.print("\nAfter Reversal : ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
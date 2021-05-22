import java.util.Scanner;
class ArrayAsc
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("How many numbers you want to enter : ");
		int a[] = new int[n];
		int temp;
		System.out.println("Enter values : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println();
		for(int b:a)
		{
			System.out.print(b+"\t");
		}
	}
}
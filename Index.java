import java.util.Scanner;
class Index
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter : ");
		n=sc.nextInt();	
		int[] a =new int[n];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter number to find its index : ");
		n=sc.nextInt();	
		for(i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				break;
			}
		}
		if(i<a.length)
		{
			System.out.println("Data is availaible on the index " +(i+1));
		}
		else
		{
			System.out.println("Data not availaible.");
		}
	}
}
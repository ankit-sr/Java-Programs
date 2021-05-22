import java.util.Scanner;
class ArrayRotation
{
	public static void main(String[] args)
	{
		int i,j,m,n,x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and column of the matric respectively : ");
		x=sc.nextInt();
		y=sc.nextInt();
		int[][] a = new int[x][y];
		int[][] temp = new int[x][y];
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		for(i=0,m=0; i<x; i++,m++)
		{
			for(j=0,n=y-1;j<y;j++,n--)
			{
				temp[i][j] = a[n][m];
			}
		}
		System.out.println("Array after rotating clockwise by one : ");
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				a[i][j] = temp[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}


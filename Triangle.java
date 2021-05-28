import java.util.Scanner;
class Triangle
{
	public static void main(String[] args)
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two angles of triangle : ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("The third angle of the triangle is : "+(180-(x+y)));
	}
}
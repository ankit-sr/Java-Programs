import java.util.Scanner;
class Area_triangle
{
	public static void main(String[] args)
	{
		double base,height,area=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and height of the triangle : ");
		base=sc.nextDouble();
		height=sc.nextDouble();
		area=base*height/2;
		System.out.println("The area of the triangle is : "+area);
	}
}
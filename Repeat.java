import java.util.Scanner;
class Repeat
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int i=0;
		while(i<s1.length())
		{
			System.out.print(s1.substring(0,2));
			i++;
		}
	}	
}
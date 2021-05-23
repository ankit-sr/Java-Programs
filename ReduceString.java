import java.util.Scanner;
class ReduceString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(s1.substring(1,s1.length()-1));
	}
}
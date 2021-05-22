import java.util.Scanner;
class Concat
{
	public static void main(String[] args)
	{
	String s1,s2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two strings : ");
	s1 = sc.next();
	s2 = sc.next();
	if(s1.charAt(s1.length()-1)==s2.charAt(0))
	{
		s2=s2.substring(1);
	}
	System.out.println(s1.concat(s2));
	}
}
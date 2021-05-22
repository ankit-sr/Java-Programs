import java.util.Scanner;
class Alphabetical
{
	public static void main(String[] args)
	{
		String s = "This is a test string";
		String res = "";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
				res = res + " ";
			else
				res = res + ((int)s.charAt(i)-96);
		}
		System.out.println(res);
	}
}
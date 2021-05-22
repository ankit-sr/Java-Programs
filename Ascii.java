import java.util.Scanner;
class Ascii
{
	public static void main(String[] args)
	{
		String s = "This is a test string";
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
				res = res + " ";
			else
				res = res + (int)s.charAt(i);
		}
		System.out.println(res);
	}
}
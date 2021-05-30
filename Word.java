import java.util.Scanner;
class Word
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an incomplete word.");
		String s1 = sc.next();
		System.out.println("Enter words seperated by colon.");
		String s2 = sc.next();
		String res = "";
		String[] r = s2.split(":");
		int n = s1.indexOf("_");
		for(String b:r)
		{
			if(s1.length() == b.length())
			{
				String temp = s1;
				char ch = b.charAt(n);
				temp = temp.replace('_',ch);
				temp = temp.toUpperCase();
				if(b.equalsIgnoreCase(temp))
				{
					if(res.equals(""))
					{
						res = res + temp;
					}
					else
					{
						res = res + ":" + temp;
					}
				}
			}
		}
		System.out.println(res);
	}
}
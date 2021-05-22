import java.util.Scanner;
class FirstWord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String[] r = s1.split(" ");
		String res = "";
		for(String b:r)
		{
			String x = (""+b.charAt(0)).toUpperCase();
			String y = b.substring(1);
			res = x+y+" ";
		}
		System.out.println(res.trim());
	}
}
		
		
import java.util.Scanner;
class Username
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name.");
		String fname = sc.next();
		System.out.println("Enter Last name.");
		String lname = sc.next();
		System.out.println("Enter a six digit Pin.");
		int pin = sc.nextInt();
		System.out.println("Enter number 0<N<7.");
		int n = sc.nextInt();
		String res = "";
		String p = ""+pin;
		int len = p.length();
		String ch="";
		if(fname.length()>lname.length())
		{
			if(lname.charAt(0)>=97 && lname.charAt(0)<=122)
			{
				ch = "" + lname.charAt(0);
				res = res+ ch.toUpperCase();
			}
			else
			{
				ch = "" + lname.charAt(0);
				res = res+ ch.toLowerCase();
			}
			
			res = res + fname.toUpperCase();
			res = res + p.charAt(n-1) + p.charAt(len-n);
		}
		else if(fname.length()==lname.length())
		{
			for(int i=0;i<fname.length();i++)
			{
				if(fname.charAt(i)==lname.charAt(i))
					continue;
				else
				{
					if(fname.charAt(i)>lname.charAt(i))
					{
						if(lname.charAt(0)>=97 && lname.charAt(0)<=122)
						{
							ch = "" + lname.charAt(0); 
							res = res+ch.toUpperCase();
						}
						else
						{	
							ch = "" + lname.charAt(0);
							res = res+ ch.toLowerCase();
						}	
			
						res = res + fname.toUpperCase();
						res = res + p.charAt(n-1) + p.charAt(len-n);
					}
					else
					{
						if(fname.charAt(0)>=97 && fname.charAt(0)<=122)
						{	
							ch = "" + fname.charAt(0); 
							res = res+ch.toUpperCase();
						}
						else
						{	
							ch = "" + fname.charAt(0);
							res = res+ch.toLowerCase();
						}	
						res = res + lname.toUpperCase();
						res = res + p.charAt(n-1) + p.charAt(len-n);
					}
					break;
				}
			}
		}
		else
		{
			if(fname.charAt(0)>=97 && fname.charAt(0)<=122)
			{	
				ch = "" + fname.charAt(0); 
				res = res+ch.toUpperCase();
			}
			else
			{	
				ch = "" + fname.charAt(0); 
				res = res+ch.toLowerCase();
			}
			res = res + fname.toUpperCase();
			res = res + p.charAt(n-1) + p.charAt(len-n);
		}	
		System.out.println(res);
	}
}
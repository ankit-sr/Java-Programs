import java.util.Scanner;
class Electricitybill
{
	public static void main(String[] args)
	{
		double units,amount,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units consumed :");
		units=sc.nextInt();
		if(units<=50)
		{
			amount=(0.5*units)+(0.2*units);
			System.out.println("Bill amount is:"+amount);
		}
		else if(units<=100)
		{
			amount=(0.75*units)+(0.2*units);
			System.out.println("Bill amount is:"+amount);
		}
		else if(units<=200)
		{
			amount=(1.20*units)+(0.2*units);
			System.out.println("Bill amount is:"+amount);
		}
		else if(units>200)
		{
			amount=(1.5*units)+(0.2*units);
			System.out.println("Bill amount is:"+amount);
		}
	}
};
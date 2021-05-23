import java.util.Scanner;
class Salary
{
	public static void main(String[] args)
	{
		double basesal, hra,da,grosssalary;
		Scanner sc= new Scanner(System.in);
		basesal=sc.nextDouble();
		if(basesal<=10000)
		{
			hra =0.20 * basesal;
			da=0.80 * basesal;
		}
		else if(basesal<=20000)
		{
			hra = 0.25 * basesal;
			da=0.90 * basesal;
		}
		else 
		{
			hra = 0.30 * basesal;
			da=0.95 * basesal;
		}
		grosssalary=basesal+hra+da;
		System.out.println("Gross Salary = " + grosssalary);
		
	}
}
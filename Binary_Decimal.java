
import java.util.Scanner;
import static java.lang.Math.pow;
class Binary_Decimal
{
	public static void main(String[] args)
	{
	int binary,dec=0,rem,i=0;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the binary number:");
    binary=sc.nextInt();
    while(binary!=0)
	{
		rem=binary%10;
		dec=(int)(dec+rem*pow(2,i));
		i++;
		binary=binary/10;
	}		
	System.out.println("Decimal number is:"+dec);
	
}
}
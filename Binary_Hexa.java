import java .util.Scanner;
import static java.lang.Math.pow;
class Binary_Hexa
{
public static void main(String[] args)
{
	int bin,num=0,rem,dec,j=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a binary number : ");
	bin=sc.nextInt();
	int[] hex = new int[10];
	while(bin!=0)
	{
		int i=0;
		dec=0; num=0;
		for(int k=0;k<3;k++)
		{
			rem=bin%10;
			num=(num*10)+rem;
			bin=bin/10;
		}
		while(num!=0)
		{
			rem=num%10;
			dec=(int)(dec+rem*pow(2,i));
			i++;
			num=num/10;
		}
		switch(dec)
		{
			case 10: 
				hex[j]='A';
				j++;
				break;
			case 11: 
				hex[j]='B';
				j++;
				break;
			case 12: 
				hex[j]='C';
				j++;
				break;
			case 13: 
				hex[j]='D';
				j++;
				break;
			case 14: 
				hex[j]='E';
				j++;
				break;
			case 15: 
				hex[j]='F';
				j++;
				break;
			default: 
				hex[j]=dec;
				break;
		}	
	}
	System.out.print("Hexadecimal number is : ");
	for(int i=0;i<10;i++)
	{
		System.out.print(hex[i]);
	}
}
}
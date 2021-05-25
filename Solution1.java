import java.util.Scanner;

class Solution1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,z,result=0;
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		int ones[] = new int[3];
		int tens[] = new int[3];
		int hundred[] = new int[3];
		
		ones[0]=x%10; x=x/10;
		ones[1]=y%10; y=y/10;
		ones[2]=z%10; z=z/10;
		
		tens[0]=x%10; x=x/10;
		tens[1]=y%10; y=y/10;
		tens[2]=z%10; z=z/10;
		
		hundred[0]=x%10; 
		hundred[1]=y%10;
		hundred[2]=z%10;
		
		int min=ones[0];
		int max=ones[0];
		for(int i=0;i<3;i++)
		{
			if(ones[i]<min)
				min = ones[i];
			if(ones[i]>max)
				max = ones[i];
		}
		result = min;
		
		min=tens[0];
		for(int i=0;i<3;i++)
		{
			if(tens[i]<min)
				min = tens[i];
			if(tens[i]>max)
				max = tens[i];
		}
		result = 10*min + result;
		
		min=hundred[0];
		for(int i=0;i<3;i++)
		{
			if(hundred[i]<min)
				min = hundred[i];
			if(hundred[i]>max)
				max = hundred[i];
		}
		
		result = (1000*max) + (100*min) + result;
		System.out.print(result);
	}
}
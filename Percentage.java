 import java.util.Scanner;
 class Percentage
 {
	 public static void main(String[] args)
	 {
		double phy,chem,maths,bio,comp,percent;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks obtained in Physics : ");
		phy=sc.nextDouble();
		System.out.print("\nEnter marks obtained in Chemistry : ");
		chem=sc.nextDouble();
		System.out.print("\nEnter marks obtained in Maths : ");
		maths=sc.nextDouble();
		System.out.print("\nEnter marks obtained in Biology : ");
		bio=sc.nextDouble();
		System.out.println("\nEnter marks obtained in Computer : ");
		comp=sc.nextDouble();
		percent=(phy+chem+maths+bio+comp)*100/500;
		if(percent>= 90) 
			System.out.println("Grade A");
		else if(percent>= 80)
			System.out.println("Grade B");
		else if(percent>= 70) 
			System.out.println("Grade C");
		else if(percent>= 60)
			System.out.println("Grade D");
		else if(percent>= 40) 
			System.out.println("Grade E");
		else 
			System.out.println("Grade F");
	 }	
 }
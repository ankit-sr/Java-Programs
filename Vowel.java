import java.util.Scanner;
class Vowel
{
	public static void main(String[] args)
	{
		char ch;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any alphabet : ");
		ch = obj.next().charAt(0);
		switch(ch)
		{
			case 'a':
				System.out.println("Given cahracter is a vowel.");
				break;
			case 'e':
				System.out.println("Given cahracter is a vowel.");
				break;
			case 'i':
				System.out.println("Given cahracter is a vowel.");
				break;
			case 'o':
				System.out.println("Given cahracter is a vowel.");
				break;
			case 'u':
				System.out.println("Given cahracter is a vowel.");
				break;
			default:
				System.out.println("Given cahracter is a consonant.");
		}
	}
}
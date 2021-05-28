
class Main
{
	 public static void main(){
	 System.out.println("Hello");
	}
}
class Test extends Main
{

	
	public static void main(String[] args)
	{
		int x = 5;
		int y = 6;
		{
			System.out.println(x+" "+y);
		}
		System.out.println(x+" "+y);
		
		String[] b = {"hello", "hi"};
		
		Main.main();
	}
}

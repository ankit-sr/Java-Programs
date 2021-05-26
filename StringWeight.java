
import java.util.Scanner;


public class StringWeight {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String st =  sc.nextLine();
        int x = sc.nextInt();
        int sum = 0;
        st = st.toUpperCase();
        if(x == 0)
        {
            for(int i=0; i<st.length();i++)
            {
                char ch = st.charAt(i);
                if(ch>=66 && ch<=90 && ch!=69 && ch!=73 && ch!=79 && ch!=85)
                {
                    sum = sum + ch - 64;
					
                }
            }
        }
		else if(x == 1){
			for(int i=0; i<st.length();i++)
            {
                char ch = st.charAt(i);
                if(ch>=65 && ch<=90)
                {
                    sum = sum + ch - 64;
                }
            }
		}
		System.out.println(sum);
    }
    
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i,temp,count=0;
        double sum=0.0;
        temp = number;
        while(temp>0)
        {
            temp = temp /10;
            count++;
        }
        String s = ""+number;
        int arr[] = new int[count+1];
        
        for(i = 0 ; i < s.length() ; i++)
        {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }
        
        for(i = 0 ; i < arr.length - 1 ; i++)
        {
            sum = sum + Math.pow(arr[i] , arr[i+1]);
        }
        
        
        System.out.print((int)sum);
    }
}
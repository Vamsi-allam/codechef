import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count= 0;
            int arr[] = new int[a];
            for(int i = 0;i<arr.length;i++)
            {
                arr[i] = sc.nextInt();
                if(arr[i]>=b){
                    count++;
                }   
            }
            System.out.println(count);
        }
	}
}

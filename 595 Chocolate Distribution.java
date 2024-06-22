// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         while(n-->0){
//             double a = sc.nextInt();
//             double first = (double)Math.ceil(a/2);
//             System.out.println((int)first+" "+(int)a);
//         }
// 	}
// }
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-->0){
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println(n/2+" "+n);
            }
            else{
                System.out.println(((n/2) + 1) + " "+n);
            }
        }
	}
}




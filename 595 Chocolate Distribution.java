/*Christmas is the season of giving. As a part of celebrating the New Year, you decided to give away chocolates to the poor children in your neighbourhood.
Some of them even asked for 
2
2 chocolates and being the kind soul that you are, you always gave them if you could. They never asked for more than 
2
2 though because they are not greedy.

Now, you have forgotten exactly how many children you gave chocolates to. However, you remember that you started with 
𝑁
N chocolates and distributed all of them by the end.
Find the minimum and maximum number of possible children that you gave chocolates to.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of one integer 
𝑁
N, the number of chocolates you started with.
Output Format
For each test case, output on a new line, two space-separated integers, the minimum possible number of children and the maximum possible number (in this order).*/

//code
//-----------------------------------------------------------------------------------------------------------------------------------------------
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




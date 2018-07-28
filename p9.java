import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.print("");
		int k=sc.nextInt();
      int sum = 0;
      //Advanced for loop
      for(int num=1;num <= k;num++) {
          sum = sum+num;
      }
      System.out.println(sum);
	}
}

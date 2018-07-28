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
		int count = 0;
		int num=sc.nextInt();

        for(; num != 0; num/=10, ++count) {   
        }

        System.out.println(count);
	}
}

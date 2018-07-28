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
		int num =sc.nextInt();
		int re = 0, remainder, or;

        or = num;

        // reversed integer is stored in variable
        for( ;num != 0; num /= 10 )
        {
            remainder = num % 10;
            re = re * 10 + remainder;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (or == re)
            System.out.println("yes");
        else
            System.out.println("no");

	}
}

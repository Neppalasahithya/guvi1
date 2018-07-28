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
		  int base =sc.nextInt();
		  int exponent =sc.nextInt();
		  int i;
		  int power=1;
        for(i = 1; i <= exponent; i++)
		{
			power = power * base;
		}
		System.out.print(power);
	
	}
}

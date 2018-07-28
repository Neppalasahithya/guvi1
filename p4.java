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
		char a=sc.next().charAt(0);
		if(a>='a'&&a<='z'||a>='A'&&a<='Z')
		{
			System.out.print("Alphabet");
		}
		else
		{
			System.out.print("No");
		}
	}
}

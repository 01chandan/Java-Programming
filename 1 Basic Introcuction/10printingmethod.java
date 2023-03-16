//printing using system.out.println()

import java.lang.*;
import java.util.*;

class print
{
	public static void main(String args[])
	{
		System.out.println("\nPrintting Methods | Java ");
		System.out.println("--------------------------");
		int a = 10;
		int b = 20;
		
		//printing  method
		System.out.println("Result: " + a + b); //fisrt (a) will concatenate with  String(Result)
		// and produced output (Result 10), then after concatenate with  (b) and output is (Result 1020)
		
		System.out.println("Result: " + (a+b));	//first addition done using brackets then concatenate
		
		//Ques: print "Sum of 10 and 20 is = 30"
		
		System.out.println("sum of "+ a +" and "+ b + " is = " + (a+b));
	}
}
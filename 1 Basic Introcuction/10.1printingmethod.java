//printing using system.out.println()

import java.lang.*;
class print
{
	public static void main(String args[])
	{
		System.out.println("\nPrintting Methods | Java");
		System.out.println("--------------------------");
		int a = 10;
		float f = 10.50f;
		char c = 'A';
		//we use format specifiers (%d, %f & so on...)
		System.out.printf("Result: %d \nResult: %f \nResult: %c ", a, f, c); //we use printf like in c language
	
	}
}
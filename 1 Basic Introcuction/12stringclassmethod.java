//String Class Methods
import java.lang.*;

class method
{
	public static void main(String args[])
	{
		System.out.println("\nString Class Method | Java ");
		System.out.println("----------------------------");
		//Working only Strings
		String str = "Java";
		System.out.println("\nResult: " + str.length());		// use to Count alphabets
		System.out.println("\nResult: " + str.toLowerCase());	// use to represent in lowerCase
		System.out.println("\nResult: " + str.toUpperCase());	// use to represent in UpperCase
		String str1 = "    Java    ";
		System.out.println("\nResult: " + str1);				//Output have Extra Spaces
		System.out.println("\nResult: " + str1.trim());			// use to remove extra Spaces
		
		String str2 = "Programming";
		System.out.println("\nResult: " + str2.substring(3));
		System.out.println("\nResult: " + str2.substring(3, 5));	//another version of sub string
		
		String str3 = "ProgrammingWalla";
		System.out.println("\nResult: " + str3.replace("gra","hra"));
		
		//Working on integer this method return integers values
		
		String str4 = "www.javawala.com";
		System.out.println("\nResult: " + str4.indexOf("."));	//find (.) from left to right
		System.out.println("\nResult: " + str4.indexOf(".", 4));	//4 means find (.) but start fromindex 4
		
		System.out.println("\nResult: " + str4.lastIndexOf("."));//find (.) from rigth to left
		
	}
}
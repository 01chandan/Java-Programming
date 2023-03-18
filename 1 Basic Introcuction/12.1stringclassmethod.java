//String Class Methods
import java.lang.*;

class method
{
	public static void main(String args[])
	{
		System.out.println("\nString Class Method | Java ");
		System.out.println("----------------------------");
		
		//Working on Boolean these methods return boolean i.e (true & false)
		//Boolean always True or false
		String str4 = "www.javawala.com";
			//index =  0123456789....... so on
			
		System.out.println("\nResult: " + str4.startsWith("www"));
		System.out.println("\nResult: " + str4.endsWith("com"));	
		
		//we use like this with start in index
		System.out.println("\nResult: " + str4.startsWith("Java", 4)); //this is flase because case sensitive
		System.out.println("\nResult: " + str4.startsWith("java", 4)); //this is true 
		
		//Some other Methods 
		String str5 = "compare";
		String str6 = "compare";
		System.out.println(str5.equals(str6));// if your words are same then use  this
		
		//if your dont want to same word and you want to ignore lower case or upper case then
		
		String str7 = "Compare";
		String str8 = "COMPARE";
		System.out.println(str7.equalsIgnoreCase(str8));	// different word case
		
		//note for more methods check pdf
	} 
}
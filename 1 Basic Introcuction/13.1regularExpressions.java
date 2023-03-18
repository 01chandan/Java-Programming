// Regular Expressions Patterns 
import java.lang.*;
/*	|-----------------------------------------------|	
	|				Meta Character					|
	|-----------------------------------------------|
	| \d			|	Digits						|
	| 				|								|
	| \D			|	Not Digits					|
	| 				|								|
	| \s			|	Space						|
	| 				|								|
	| \S			|	Not Space					|
	| 				|								|
	| \w			|	Alphabets or digit			|
	| 				|								|
	| \W			|	Neither Alphabets or digit	|
	|-----------------------------------------------|
	
	Note:- use \\d not \d because we already use  \n as scape sequences so complier become confuse.
	// and we also use matching expression i.e matches();
*/
class expression
{
	public static void main(String args[])
	{
		System.out.println("\nRegular Expression Patter (RegEx)");
		System.out.println("-----------------------------------");
		
		String str1 = "5";
		System.out.println(str1.matches("\\w"));	// w for single digit and single alphabets 
		System.out.println(str1.matches("\\W"));	// other than digit and alphabet it means symbols
		System.out.println(str1.matches("\\d"));	//d for single digits
		System.out.println(str1.matches("\\D"));	//D for Not a digits means its ture when it a alphabets
		
		String str2 = "$";
		System.out.println(str2.matches("\\w"));
		System.out.println(str2.matches("\\W"));
		
		String str3 = " ";
		System.out.println(str3.matches("\\s"));	//s use for space or not
		System.out.println(str3.matches("\\S"));	
	}
	
}
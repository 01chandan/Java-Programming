// Regular Expressions Patterns
import java.lang.*;
/*	|-----------------------------------------------|	
	|				Matching Symbols				|
	|-----------------------------------------------|
	| .				|	Any Character				|
	| 				|								|
	| [abc]			|	Exactly given letter		|
	| 				|								|
	| [abc] [vz]	|	Either first or second set	|
	| 				|								|
	| [^abc]		|	Except abc					|
	| 				|								|
	| [a-z 1-7]		|	a-z or 1-7					|
	| 				|								|
	| A|B			|	A or B						|
	| 				|								|
	| XZ			|	Exactly XZ					|
	|-----------------------------------------------|
	
	Brackets are used for finding Range of character or number

*/
class expression
{
	public static void main(String args[])
	{
		System.out.println("\nRegular Expression Patter (RegEx)");
		System.out.println("-----------------------------------");
		String str1 = "A";
		System.out.println(str1.matches("."));
		String str2 = "AB";
		System.out.println(str2.matches("."));
		System.out.println("\n");
		
		String str3 = "Moon";
		System.out.println(str3.matches("o"));
		System.out.println(str3.matches("Moon"));
		System.out.println("\n");
		
		String str4 = "Programming is fun";
		System.out.println(str4.matches(""));
	}
}
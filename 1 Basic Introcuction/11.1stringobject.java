//Creating String Objects
import java.lang.*;

class object
{
	public static void main(String args[])
	{
		System.out.println("\nCreating String Object | Java ");
		System.out.println("-------------------------------");
	//Note Str and Str1 both object are same because both created in String pool and both have same output
	//Ques-> How we know both are locating same object 
	//Ans -> Compare their references 
		String str = "hello";
		String str1 = "hello";

		System.out.println(str==str1);
		
		String str2 = "Hello";		//H is different
		String str3 = "hello";

		System.out.println(str2==str3);
	}

}
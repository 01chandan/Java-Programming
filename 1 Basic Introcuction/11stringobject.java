//Creating String Objects
import java.lang.*;

class object
{
	public static void main(String args[])
	{
		System.out.println("\nCreating String Object | Java ");
		System.out.println("-------------------------------");
		String str = "hello";		//object created in String pool
		System.out.println("\nResult: " + str + " (String Pool)");
		
		String str1 = "hello";
		System.out.println("\nResult: " + str1 + " (String Pool)"); //object created in String pool
//Note Str and Str1 both object are same because both created in String pool and both have same output
	//Ques-> How we know both are locating same object 
	//Ans -> Compare their references 
		
		System.out.println("\n");
		System.out.println(str==str1);


		String str2 = new String("Hello world" + "( Created in Heap)");	//object created in  heap
		System.out.println("\nResult: " + str2);
		
		char c[] = {'C','H','A','N','D','A','N'};
		String str3 = new String (c);		//object created in heap
		System.out.println("\nResult: " + str3);
	}
}
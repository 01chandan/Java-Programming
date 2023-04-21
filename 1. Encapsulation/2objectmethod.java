//Other method to creating an object
import java.lang.*;

class object
{
	int marks = 100;
	String name = "Chandan";
	
	void show()
	{
		System.out.println("Marks: " + marks);
		System.out.println("Student Name: " + name);
	}
	
	public static void main(String args[])
	{
		System.out.println("\nAnonymous Object | Java ");
		System.out.println("-------------------------");
		//Anonymous object use only one time and not creating any reference variable
		
		new object().show();
		
		//Anonymous object reference id 
		System.out.println("Reference id: " + new object());
		
		
	} 
}
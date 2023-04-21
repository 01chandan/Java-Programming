// static block in java 
//JRE decide the priority section of every code (means code of execution)
import java.lang.*;
class method
{
	static int x = 10;	//static data menber declared
	
	//Note if we remove static then its convert init block (means block without name and it works with default constructor or Constructor)
	static		//static method declared
	{
		System.out.println("Static Method: " + x);
	}
	
	void show() 	//Normal method Declared
	{
		System.out.println("Normal Function call");
	}
	
	public static void main(String args[])
	{
		System.out.println("\nStatic Block | Java");
		System.out.println("---------------------");
		//call normal fuction first and use anonymous object (means one time call only object)
		new method().show();
		
		//Note static block show (no need to create an object of static it's print directly)
		
		//another input print
		System.out.println("Write in main function");
	}
}
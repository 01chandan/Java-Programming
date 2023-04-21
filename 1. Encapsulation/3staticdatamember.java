//Static Data member
import java.lang.*;

class method
{
	int id;
	String name;
	static String company = "TCS";	//static data member
	
	void insert(int eid, String ename)
	{
		id = eid;
		name = ename;
	}
	
	void show()
	{
		System.out.println("ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Company Name: " + company);// method.company is also correct for call data member
	}
	
	public static void main(String args[])
	{
		System.out.println("\nStatic Method | Java ");
		System.out.println("----------------------");
		//Static variable no needs to create an object because static variable occupy memory compile time
		//tcs occupy memory compile time in  class loading section.
		
		method ob1 = new method();
		ob1.insert(101, "Chandan");
		ob1.show();
		
		method ob2 = new method();
		ob2.insert(105, "Shivani");
		ob2.show();

	} 
}
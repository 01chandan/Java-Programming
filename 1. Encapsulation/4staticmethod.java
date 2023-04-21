// Static method or static member function
//static member data and static member function belong always class loading section and reference create compile time
import java.lang.*;

class method
{
	int eid;
	String ename;
	static String cname = "TCS";
	
	void insert(int id, String name)
	{
		eid = id;
		ename = name;
	}
	//static method create because access and change of static data member we need to create method first
	static void change(String name)
	{
		cname = name;	//reference create compile time 
	}
	
	void show()
	{
		System.out.println("ID: " + eid);
		System.out.println("Emp Name: " + ename);
		System.out.println("Company: " + cname);
	}
	
	public static void main(String args[])
	{
		System.out.println("\nStatic Member function | Java");
		System.out.println("-------------------------------");
		change("Google");
		
		method ob1 = new method();
		ob1.insert(101, "Chandan");
		ob1.show();
		
		method ob2 = new method();
		ob2.insert(102, "Karan");
		ob2.show();
		
	}
	
}
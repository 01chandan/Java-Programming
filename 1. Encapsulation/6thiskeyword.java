//this keyword is a reference variable that's (refers) hold the current object.
//this is local level variable and access class level variable
import java.lang.*;

class method
{
	int empid;
	String ename, ecompany;
	
	void insert(int empid, String ename, String ecompany)
	{
		this.empid = empid;
		this.ename = ename;
		this.ecompany = ecompany;
	}
	
	void show()
	{
		System.out.println("Emp ID: " + empid);
		System.out.println("Emp Name: " + ename);
		System.out.println("Emp Company: " + ecompany);
	}
	public static void main(String args[])
	{
		System.out.println("\nthis Keyword | Java");
		System.out.println("---------------------");
		
		method obj1 = new method();
		obj1.insert(101, "Chandan", "KATHA");
		obj1.show();
	}
	
}

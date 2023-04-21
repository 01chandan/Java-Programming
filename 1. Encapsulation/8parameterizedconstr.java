//Parameterized Constructor
import java.lang.*;
class method
{
	int eid;
	String ename, edept;
	
	method(int eid, String ename, String edept)
	{
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
	}
	
	void show()
	{
		System.out.println("Emp ID: " + eid);
		System.out.println("Emp Name: " + ename);
		System.out.println("Emp Department: " + edept);
	}

	public static void main(String args[])
	{
		System.out.println("\nParameterized Constructor | Java");
		System.out.println("----------------------------------");
		method ob1 = new method(101, "Chandan", "Techinical");
		method ob2 = new method(102, "Shivani", "IT");
		ob1.show();
		ob2.show();

	}
}

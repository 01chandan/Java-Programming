//Encapsulation is a method when we wrap member data and member function together.
import java.lang.*;

class method
{
	int Eid;
	String Ename, Ecourse;
	
	void display(int id, String name, String course) //wrap member data and member function
	{
		Eid = id;
		Ename = name;
		Ecourse = course;
	}
	
	void show()	//call method or function
	{
		System.out.println("Employee ID: " + Eid);
		System.out.println("Employee Name: " + Ename);
		System.out.println("Employee Course: " + Ecourse);
	}
	
	public static void main(String args[])
	{
		System.out.println("\nCreate Class & Object | Encapsulation");
		System.out.println("---------------------------------------");
		method ob1 = new method();
		ob1.display(101, "Chandan", "BCA");
		ob1.show();
		System.out.println(ob1); 	//print the reference id of an object that store in ob1.
		
		//hash code is a method belong object class. return type is integer we inherite indirectly propery of hashCode
		System.out.println(ob1.hashCode());
		
		//we create 2 objects of same class methods (function)
		method ob2 = new method();
		ob2.display(102, "Shivani", "MCA");
		ob2.show();
		System.out.println(ob2); 	//print the reference id of an object that store in ob2.
		
		//object class is  a parent class that include hashCode
		//hash code is a method belong object class. return type is integer we inherite indirectly propery of hashCode
		System.out.println(ob2.hashCode()); 	
	}
}
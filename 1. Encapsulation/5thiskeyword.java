//this keyword is a reference variable that's (refers) hold the current object.
//this is local level variable and access class level variable
import java.lang.*;

class method
{
	int x = 10;
	
	void show(int x, method z)	//we cannot use this as a variable coz already predefined
	{
		System.out.println("Result: " + x);
		System.out.println("Result: " + z.x);
		System.out.println("Current object address: " + z);		//current object reference print
	}
	public static void main(String args[])
	{
		System.out.println("\nthis Keyword | Java");
		System.out.println("---------------------");
		
		method obj1 = new method();
		obj1.show(20, obj1);	    //current reference object pass
		System.out.println("Current object reference: " + obj1);	//current reference object print

		
	}
	
}

//we also make this code easier like this coz we know this always hold current object reference

/*
import java.lang.*;

class method
{
	int x = 10;
	
	void show(int x)	//we cannot use this as a variable coz already predefined
	{
		System.out.println("Result: " + x);
		System.out.println("Result: " + this.x);
	}
	public static void main(String args[])
	{
		System.out.println("\nthis Keyword | Java");
		System.out.println("---------------------");
		
		method obj1 = new method();
		obj1.show(20);	    
		System.out.println("Current object reference: " + obj1);	//current reference object print

	}
	
}
*/
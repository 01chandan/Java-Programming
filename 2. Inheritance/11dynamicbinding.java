import java.lang.*;
/* Static Binding & Dynamic Binding
Compile time binding = Static Binding
Run Time Binding = Dynamic Binding */
class superclass
{
    void same()
    {
        System.out.print("Super class call");
    }
}
class base extends superclass
{
    
    void same()
    {
        super.same();   //call parent class function
        System.out.print("\nBase class call");
    }
    public static void main(String args[])
    {
	  System.out.println("\nDynamic Binding | Java");
	  System.out.println("-------------------------");
      superclass obj1 = new base();
      obj1.same();
    }
}
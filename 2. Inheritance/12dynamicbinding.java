import java.lang.*;
/* Static Binding & Dynamic Binding
Compile time binding = Static Binding
Run Time Binding = Dynamic Binding */
class superclass
{
    void same()
    {
        System.out.println("Super class call");
    }
    void disp()
    {
        System.out.println("Display FUnction Call");
    }
}
class base extends superclass
{
    
    void same()
    {
        super.same();   //call parent class function
        super.disp();   //call parent class function
        System.out.println("Base class call");
    }
    public static void main(String args[])
    {
        System.out.println("\nDynamic Binding | Java");
        System.out.println("-------------------------");
      superclass obj1 = new base();
      obj1.same();
    }
}
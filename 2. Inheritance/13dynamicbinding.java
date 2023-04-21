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

}
class base extends superclass
{
    
    void same()
    {
        super.same();   //call parent class function
        System.out.println("Base class call");
    }
    void disp()
    {
        System.out.println("Display FUnction Call");
    }
    public static void main(String args[])
    {
        System.out.println("\nDynamic Binding | Java");
        System.out.println("-------------------------");
      superclass obj1 = new base(); //Up Casting
      obj1.same();
      base obj2 = (base) obj1;      //Down Casting
      obj2.disp(); 
    }
}
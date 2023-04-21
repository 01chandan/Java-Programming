/* Can we declare one default method with function interface */
/* Yes!  */
import java.lang.*;

@FunctionalInterface    //Annotation
interface abst
{
    default void show1()    //default method
    {
        System.out.println("Default Method call");
    }
    void show();    //abstract method
}

class main implements abst
{
    public void show()
    {
        System.out.println("Functional Interface Call");
    }
    
    public static void main(String args[])
    {
        System.out.println("\nFunctional Interface | Java");
        System.out.println("-----------------------------");
        main obj1 = new main();
        obj1.show();
        obj1.show1();
    }
}

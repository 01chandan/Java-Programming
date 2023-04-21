/* Functional Interface contain only (one) abstract method. it is also
known as SAM (Single abstract method) */
import java.lang.*;

@FunctionalInterface    //Annotation
interface abst
{
    void show();
    void show1();   //remove this then code run successfully
}

class main implements abst
{
    public void show()
    {
        System.out.println("Functional Interface Call");
    }
    public void show1()
    {
        System.out.println("Functional Interface Call");
    }
    public static void main(String args[])
    {
        System.out.println("\nFunctional Interface | Java");
        System.out.println("-----------------------------");
        main obj1 = new main();
        obj1.show();
    }
}

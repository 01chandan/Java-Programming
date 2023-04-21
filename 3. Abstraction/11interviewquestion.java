/* Can we declare final in interface method */
/* No! Coz in interface case method never final & Static */
/* But Data Member can be static and final also */
import java.lang.*;

@FunctionalInterface
interface method
{
    final void show(); // remove final then run
}
class main implements Data_member
{
    public void show()
    {
        System.out.println("Final show method call");
    }
    
    public static void main(String args[])
    {
        //x = 20;  it cant be possible coz data member is static by default
        System.out.println("\nFunctional Interface | Java");
        System.out.println("-----------------------------");
        main obj1 = new main();
        obj1.show();
    }
}

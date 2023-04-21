/* declare an data member in interface and call them without creating an object */
/* Yes! but note that data member by default is (Static) in interface */
import java.lang.*;

interface Data_member
{
    int x = 5;
}
class main implements Data_member
{
    
    public static void main(String args[])
    {
        //x = 20;  it cant be possible coz data member is static by default
        System.out.println("\nFunctional Interface | Java");
        System.out.println("-----------------------------");
        System.out.println("Functional Interface Call " + (Data_member.x));
    }
}

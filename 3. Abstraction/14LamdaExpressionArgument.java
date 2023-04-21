/* Lamda Expression (Single Argument) */

import java.lang.*;

@FunctionalInterface
interface LamdaArgument
{
    void show(String name);
}
class main
{
    public static void main(String args[])
    {
        System.out.println("\nLamda Expresion Intro| Java");
        System.out.println("-----------------------------");
        LamdaArgument obj = (name)->        //with Single Arguments
        {
            System.out.println("Hello Girls I am " + name);
        };
        obj.show("Chandan");
    }
}
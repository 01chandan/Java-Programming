/* Variable argument (Varargs) */
/* Advantage:- we dont have to provide method overloaded */

import java.lang.*;

class add
{
    
    void sum(int... a)
    {
        int sum = 0;
        for(int result : a)
        {
            sum = sum + result;
        }
        System.out.println("Result: " + sum);
    }
}
class main
{
    public static void main(String args[])
    {
        System.out.println("\nVariable Argument | Java");
        System.out.println("--------------------------");
        add obj = new add();
        obj.sum();
        obj.sum(20,30);
        obj.sum(30,45,15);
        obj.sum(12,45,78,56);
    }
}
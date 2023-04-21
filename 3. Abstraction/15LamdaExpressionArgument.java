/* Lamda Expression (Two Argument) */

import java.lang.*;

@FunctionalInterface
interface LamdaTwoArgument
{
    int show(int x, int y);
}
class main
{
    public static void main(String args[])
    {
        System.out.println("\nLamda Expresion Intro| Java");
        System.out.println("-----------------------------");
        LamdaTwoArgument obj = (a,b)->  //two arguments
        {
           return a + b;  
        };
        System.out.println(obj.show(10,20));
    }
}
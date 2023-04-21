/* Introduction of Lamda Expression*/

import java.lang.*;

@FunctionalInterface
interface Lamda
{
    void show();
}
class main
{
    public static void main(String args[])
    {
        System.out.println("\nLamda Expresion Intro| Java");
        System.out.println("-----------------------------");
        Lamda obj = ()->    //without any argument
        {
            System.out.println("Hey, Girls");
        };
        obj.show();
    }
}
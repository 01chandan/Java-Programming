/* Need of Lamda Expression (Ananomus class) */

import java.lang.*;

@FunctionalInterface
interface myLamda
{
    void show();
}
class main
{
    public static void main(String args[])
    {
        System.out.println("\nAnanomus Class| Java");
        System.out.println("----------------------");
        myLamda obj1 = new myLamda()
        {
            public void show()
            {
                System.out.println("Hello Lamda");
            }
        };
        obj1.show();
    }
}
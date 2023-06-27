//Comand line Argument
import java.lang.*;

class main
{
    public static void main(String[] args) {
        System.out.println("Command Line Argument | Java");
        System.out.println("-----------------------------");

        //if we use loop then we insert any value int, float & string type so on.
        for(int i=0; i<args.length; i++)
        {
            System.out.println("Hello my name is " + args[i]);
        }

    }
}
/*
 * Compile -> javac 1Introduction.java
 * Run -> java main Chandan 10.50 Kumar 1 True 1010 <-
 */
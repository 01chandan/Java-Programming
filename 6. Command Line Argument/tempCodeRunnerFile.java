//Comand line Argument
import java.lang.*;

class main
{
    public static void main(String[] args) {
        System.out.println("Command Line Argument | Java");
        System.out.println("-----------------------------");

        for(int i=0; i<args.length; i++)
        {
            System.out.println("Hello my name is " + args[i]);
        }

    }
}
/*
 * Compile -> javac 1Introduction.java
 * Run -> java main Chandan <-
 */
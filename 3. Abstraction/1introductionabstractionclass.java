import java.lang.*;
//Abstraction Introduction
//Note:- we dont need to create any object of abstract class
abstract class animal
{
    abstract void fly();

    void nonfly()
    {
        System.out.println("Abstract class show");
    }
}

class bird extends animal
{
    void fly()
    {
        super.nonfly();
        System.out.println("Fly Method Call");
    }

    void nonfly()
    {
        System.out.println("NoN-Fly Method Call");
    }

    public static void main(String[] args) 
    {
        System.out.println("\nAbstraction Intro | Java");
        System.out.println("--------------------------");
        bird obj1 = new bird();
        obj1.fly();    
        obj1.nonfly();    
    }
    
}
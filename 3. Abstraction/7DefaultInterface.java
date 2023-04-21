import java.lang.*;
//Inerface with default method

interface one
{
    default void show()
    {
        System.out.println("Interface Show Call");
    }
    void show1();
}

class main implements one
{
    public void show1()
    {
     System.out.println("One Class Call");
    }

    public static void main(String args[]) 
    {
        System.out.println("\nInterface | Java");
        System.out.println("-------------------");
        main obj1 = new main();
        obj1.show();
        obj1.show1();
    }   

} 
import java.lang.*;
//Can 2 interface extends singel interface
//Yes! it is possible

interface one
{
    void show();
}
interface two
{
    void show1();
}

interface three extends one, two    // behave like multiple inheritance but not real only behave 
{
    void show2();
}

class main implements two
{
    public void show()
    {
     System.out.println("One Class Call");
    }
    public void show1()
    {
     System.out.println("Two Class call");
    }
    public void show2()
    {
     System.out.println("Three Class call");
    }

    public static void main(String args[]) 
    {
        System.out.println("\nInterface | Java");
        System.out.println("-------------------");
        main obj1 = new main();
        obj1.show();
        obj1.show1();
        obj1.show2();
    }   

} 
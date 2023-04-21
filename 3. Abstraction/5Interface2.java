import java.lang.*;
//Can interface extends another interface
//Yes! it is possible

interface one
{
    void show();
}
interface two extends one
{
    void show1();
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

    public static void main(String args[]) 
    {
        System.out.println("\nInterface | Java");
        System.out.println("-------------------");
        main obj1 = new main();
        obj1.show();
        obj1.show1();
    }   

} 
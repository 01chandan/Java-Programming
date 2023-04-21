//Constructor Chaining
//Constructor Chaining (this Keyword)
class constchain
{
    constchain()
    {
        this(10);
        System.out.println("Default Constructor Run");
    }
    constchain(int x)
    {
        this(10,20);
        System.out.println("Result: " + x);
    }
    constchain(int x, int y)
    {
        System.out.println("Result: " + (x+y));
    }
    public static void main(String args[])
    {
		System.out.println("\nConstructor Chaining | Java");
		System.out.println("------------------------------");
        new constchain();   //anynamous object

    }
}
//Multi-level Inheritance (IS-A Relationship)
class dadaji
{
    int x = 10;
}

class papaji extends dadaji     //papaji inherite the properties & behaviour of dadaji
{
    int y = 20;
}

class betaji extends papaji     //betaji inherite the properties & behaviour of papaji
{
    int  z = 30;
    void show()
    {
        System.out.println("Result: " + x);
        System.out.println("Result: " + y);
        System.out.println("Result: " + z);
    }

    public static void main(String args[])
    {
	  System.out.println("\nMulti-level Inheritance | Java");
	  System.out.println("---------------------------------");
      betaji obj1 = new betaji();
      obj1.show();
    }
}
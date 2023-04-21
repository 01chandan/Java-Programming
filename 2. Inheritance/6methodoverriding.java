//Need of Method Overriding
//Method Overriding Introduction (Inheritance always achive on compile-time)

class parent{
    void show()
    {
        System.out.println("Parent Class Show");    // we cannot access parent class without using super() use next next code
    }
}
class base extends parent
{
   void show()
   {
    System.out.println("Base Class Show");
   }
    public static void main(String args[])
    {
	  System.out.println("\nMethod Overriding | Java");
	  System.out.println("--------------------------");
      base obj1 = new base();
      obj1.show();
    }
}
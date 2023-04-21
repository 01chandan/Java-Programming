//Method Overriding & Overriding
//Overreden always achive on (Run-Time) and Overriding always achive on (Compile Time)
class parent{
    void show()
    {
        System.out.println("Parent Class Show");    //method overreden
    }
}
class base extends parent
{
    void show()
   {
    System.out.println("Base Class Show");
    super.show();   //parent class inatance variable reference (method overriding)
   }
    public static void main(String args[])
    {
	  System.out.println("\nMethod Overriding | Java");
	  System.out.println("--------------------------");
      base obj1 = new base();   
      obj1.show();
    }
}
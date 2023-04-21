import java.lang.*;
/* Final Keyword use in multi-level inheritance
*/
class grandfather
{
    void show()
    {
        System.out.println("Hello Grandfather");
    }
}

class parent extends grandfather
{
    void show()
    {
        super.show();   //override use
        System.out.println("Hello Parent");
    } 
}

final class child extends parent    //final Keyword
{
  final void show()
    {
        super.show();   //override use
        System.out.println("Hello Child");
    }
    public static void main(String args[])
    {
	  System.out.println("\nFinal Keyword | Java");
	  System.out.println("---------------------");
      child obj1 = new child();
      obj1.show();
    }
}
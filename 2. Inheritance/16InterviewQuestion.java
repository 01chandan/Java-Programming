import java.lang.*;
/* Can we use final keyword in parent class method other than child class method
Ans: No it cant be possible because base class unable to inherite when super class is fixed
*/
class superclass
{
    final void show()
    {
        System.out.println("Super class show");
    }
}

class child extends superclass
{

    void show()
    {
        super.show();   //Override
        System.out.println("Child class show");
    }
    public static void main(String args[])
    {
	  System.out.println("\nFinal Keyword | Java");
	  System.out.println("---------------------");
      child obj1 = new child();
      obj1.show();
    }
}
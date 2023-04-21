import java.lang.*;
//Can we Inherite Abastract class constructor
//Yes

abstract class superclass
{
   superclass()
   {
    System.out.println("Super class const call");
   }
  abstract void show();
}
class main extends superclass
{
    main()
    {
      System.out.println("Main Class Const Call");
    }
    void show()
    {
      System.out.println("Show Method Call");
    }
  public static void main(String args[]) 
    {
      System.out.println("\nAbstraction Intro | Java");
      System.out.println("--------------------------");
      superclass obj1 = new main(); //Dynamic binding
      obj1.show();
    }  
} 
import java.lang.*;
//Can we made abstract method as static & final at same time
//Yes!
//final keyword cannot inherite or override but abstraction achive only with inhetite (Override)
abstract class superclass
{
  superclass()
  {
    System.out.println("Super class call ");
  }

  abstract  void show();    
  abstract static void show();  //we can't apply two modifiers at a same time
  abstract final void show(); 
}
class main extends superclass
{
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
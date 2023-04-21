import java.lang.*;
//Abstraction Introduction

abstract class simcard
{
   public abstract void show();
}

class base extends simcard
{
  public  void show()
    {
        int rate = 5;
        int unit = 50;
        System.out.println("Main class show" + (rate * unit));
    }
}
class main extends simcard
{
  public  void show()
    {
        int rate = 10;
        int unit = 100;
        System.out.println("Main class show" + (rate * unit));
    }

    public static void main(String args[]) 
    {
        System.out.println("\nAbstraction Intro | Java");
        System.out.println("--------------------------");
        simcard obj1 = new base();
        obj1.show();
        simcard obj2 = new main();
        obj2.show();
    }  
} 
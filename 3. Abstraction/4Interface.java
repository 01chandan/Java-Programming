//Abstraction (Interface)
//by default all method is public in Interface           
import java.lang.*;                                                
                                                                   
interface superclass                                            
{                                                               
  void show();                                                  
  void disp();                                                  
}                                                             
class main implements superclass                             
{                                                           
   public void show()   //it is compulsory to make public
    {
      System.out.println("Show Method Call");   
    }
    public void disp()   //it is compulsory to make public
    {
      System.out.println("Display Method Call");   
    }
  public static void main(String args[]) 
    {
      System.out.println("\nInterface | Java");
      System.out.println("-------------------");
      superclass obj1 = new main(); //Dynamic binding
      obj1.show();
      obj1.disp();
    }  
} 
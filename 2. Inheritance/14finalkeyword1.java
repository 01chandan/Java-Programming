import java.lang.*;
/* Final Keyword use to fixed any Variable, method & class in globaly*/
class finalnum
{
    final int x = 10;
    void show()
    {
        int x = 50;
        System.out.println("Result: " + x);
    }
    public static void main(String args[])
    {
	  System.out.println("\nFinal Keyword | Java");
	  System.out.println("---------------------");
      finalnum obj1 = new finalnum();
      obj1.show();
    }
}
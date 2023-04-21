import java.lang.*;
/* Final Keyword use to fixed any Variable, method & class in globaly
final keyword means fixed value
*/
class finalnum
{
    final int x = 10;
    void show()
    {
       // int x = 50; (this is not valid because it make another int variable type of x)
        x = 50; //not Run Because (X) value cant be can't be changed by using final keyword 
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
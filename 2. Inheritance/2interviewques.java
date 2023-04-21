/*Ques: Can we inherite private data member in child class
 Ans : No we can inherite private data member in child class but cannot access directly
 Inherite and access are different word */

/*
class msg1
{
  private int x = 10;   //private member inheriate but not access
}

class inheri extends msg1
{

    public static void main(String args[])
    {
        int y = 50;
	    System.out.println("\nSingle Inheritance | Java");
		System.out.println("---------------------------");
      //  System.out.println(x);    
        System.out.println(y);
    }
}
 */



//Ques: Can we inherite protected data member in child class
//Ans : Yes we can inherite private data member in child class & access also

class msg1
{
  protected int x = 10;   //protected member inheriate & access also
}

class inheri extends msg1
{
    int y = 50;
    void show()
    {
        System.out.println(x);   
    }
    public static void main(String args[])
    {
        int y = 50;
	    System.out.println("\nSingle Inheritance | Java");
		System.out.println("---------------------------");
        inheri obj2 = new inheri();
        obj2.show();
       // System.out.println(y);
    }
}
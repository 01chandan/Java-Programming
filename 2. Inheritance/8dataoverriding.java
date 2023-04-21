
//Data Overriding 
//Data Overriding achive when we use super() keyword

class superclass
{
    int x = 100;
}

class base extends superclass
{
    int x = 50;
    void show()
    {
        System.out.println(x);
        System.out.println(super.x);
    }

    public static void main(String args[])
    {
	  System.out.println("\nData Overriding | Java");
	  System.out.println("------------------------");
      base obj1 = new base();
      obj1.show();

    }
}
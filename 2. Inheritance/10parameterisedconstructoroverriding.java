
/* Parameterised Constructor Overriding 
Data Overriding achive when we use super() keyword in first line only
super keyword is compulsoary in Parameterised Constructor for assigning the values */
class superclass
{
    superclass(int x)
    {
        System.out.println("Super class call " + x);
    }
}
class base extends superclass
{

    base(int y)
    {
        super(50); //not optional in this case
        System.out.println("Base Class Call " + y);
    }
    public static void main(String args[])
    {
	  System.out.println("\nParameterised Constructor Overriding | Java");
	  System.out.println("----------------------------------------------");
      base obj1 = new base(20);

    }
}
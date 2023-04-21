
/* Constructor Overriding 
Data Overriding achive when we use super() keyword in first line only
super keyword is not compulsoary for achiving constructor overriding because Complier  
invoke super by default */
class superclass
{
    superclass()
    {
        System.out.println("Super class Show");
    }
}

class base extends superclass
{
    base()
    {   
        super();     //it is optional check discription for first
        System.out.println("Base Class Show");
    }

    public static void main(String args[])
    {
	  System.out.println("\nConstructor Overriding | Java");
	  System.out.println("-------------------------------");
      base obj1 = new base();

    }
}
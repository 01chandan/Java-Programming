//Constructor Overloading
//Constructor Overloading is an example is static polymorphism and also known as compile time polymorphism
import java.lang.*;

class method
{
    int eid;
    String ename, edept;

    method(int eid, String ename)
    {
        this.eid = eid;
        this.ename = ename;
    
    }
    
    method(int eid, String ename, String edept) //constructor overload
    {
        this.eid = eid;
        this.ename = ename;
        this.ename = edept;
    }

    void show()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(edept);
    }
    public static void main(String args[])
    {
		System.out.println("\nConstructor Overloading | Java");
		System.out.println("--------------------------------");
        method ob1 = new method(101,"Karan", "IT Dept");
        ob1.show();
        method ob2 = new method(102,"Chandan");
        ob2.show();
    }
}
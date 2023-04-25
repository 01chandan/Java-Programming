//class file name (1packageintro) & (2packageintro) 
import pack1.student1;
import pack1.student2;

class main 
{
    public static void main(String[] args) 
    {
        student1 obj1 = new student1();
        System.out.println("Result: " + obj1.add(20,30));
        student2 obj2 = new student2();
        obj2.getdata(101,"Chandan-Kumar", "Google");
        obj2.show();

    }
}
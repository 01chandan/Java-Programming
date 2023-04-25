package trial2;
import trail.*;
import trail.demo1;

class main
{
    void show()
    {
        System.out.println("Helo world");
    }
    public static void main(String[] args) {
        demo obj1 = new demo();
        obj1.getdata(101,"Suraj","Sec-45");
        obj1.showdata();        
        demo1 obj2 = new demo1();
        obj2.getdata(101,"Suraj","Sec-45");
        obj2.showdata();
        main obj3 = new main();
        obj3.show();
    }
}
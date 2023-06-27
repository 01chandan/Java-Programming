import java.lang.*;

class main
{
    static void fun1()
    {
        System.out.println(100/0);  //unchecked Exception
    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }
    public static void main(String[] args) {
        fun3();
    }
}

//use this code to remove exception in other functions (fun2, fun3, fun1)
/*
    try{
        System.out.println(100/0);  //unchecked Exception
    }catch(Exception e){
        System.out.println(e);
    }
 */
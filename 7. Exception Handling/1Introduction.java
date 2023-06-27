//Exception Handiling Introduction
//Topic: Try and Catch

class main
{
    public static void main(String[] args) {
        try {
        int a=5, b=0, c=a/b;        //Exception 5 is not divided with 0
        System.out.println(c);    
        } catch (ArithmeticException e) {
            System.out.println("Hello Exception");
            System.out.println("I am Handling Exception");
        }
    }

}
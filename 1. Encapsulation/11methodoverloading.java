//Method Overloading 
//Method Overloading can be achive twoo types by chnage data type & changing parameter
class methodover
{
  /*  void sum(int num1, int num2)
    {
        int total = num1 + num2;
        System.out.println("Result:" + total);
    }
  */
    void sum(int num1, int num2, int num3)
    {
        int total = num1 + num2 + num3;
        System.out.println("Result: " + total);
    }

    void sum(long num1, long num2)                  //method overload by change datatype
    {
        long total = num1 + num2;
        System.out.println("Result: " + total);
    }
    public static void main(String args[])
    {
		System.out.println("\nMethod Overloading | Java");
		System.out.println("---------------------------");
        methodover ob1 = new methodover();
        ob1.sum(10,20);
    }
}
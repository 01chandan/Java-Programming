import java.lang.*;

class main 
{
    public static void main(String[] args) {
        int A[] = {10,20,30,50,10,0};
        int result = 0;
        try 
        {
            result = A[0]/A[5];
            System.out.println("Result: " + result);

            try{
                System.out.println(A[2]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Hey Array Index Occur");
            }
            
        } catch (ArithmeticException e) {
            System.out.println("Index Cannot be Zero");
        }
    }
}
//can exception made in catch block
//yes
import java.lang.*;

class main
{
    public static void main(String[] args) {
        
        try {
            int i = 100/0;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Exceptin found: " + e);

            int A[] = new int[5];
            A[10] = 500;
            System.out.println(A[10]); 
            System.out.println("Exception Over: ");
        }

    }
}
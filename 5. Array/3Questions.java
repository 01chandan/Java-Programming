/* Left Rotation on Array */
/*
class main
{
    public static void main(String[] args) {
        System.out.println("Practical Questions");
        System.out.println("-------------------");
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        
        //for Rotation array
        int temp = A[0];
        for(int i = 1; i<A.length; i++)
        {
            A[i-1] = A[i];
        }
        A[A.length - 1] = temp;

        //for printing array
        for(int x:A)
        {
            System.out.print(x + " ");
        }
    } 
}
  */
/* Right Rotation on Array */

class main1
{
    public static void main(String[] args) {
        System.out.println("Practical Questions");
        System.out.println("-------------------");
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        
        //for Rotation array
        int temp = A[A.length-1];
        for(int i = (A.length-2); i>=0; i--)
        {
            A[i+1] = A[i];
        }
        A[0] = temp;

        for(int x:A)
        {
            System.out.println(x + " ");
        }

        
        //for printing array
        
    
    } 
}
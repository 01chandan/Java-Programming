/* Insert and Delete an element of an array */
//for inserting length of array is compulsoary
class main
{
    public static void main(String[] args) {
        System.out.println("Practical Questions");
        System.out.println("-------------------");
        int A[] = new int[8];
        A[0] = 10; A[1] = 20; A[2] = 30; A[3] = 40; A[4] = 50; A[5] = 60;

        for(var x:A)
        {
            System.out.print(x + " ");
        }
        for(int i=(A.length-1); i>1; i--)
        {
            A[i] = A[i-1];
        }
        A[2] = 25;

        System.out.println("\n\n");
        
        for(var x:A)
        {
            System.out.print(x + " ");
        }
    } 
}

//You can also write like this for saving lines of code
/*
class main
{
    public static void main(String[] args) {
        System.out.println("Practical Questions");
        System.out.println("-------------------");
        int A[] = new int[8];
        A[0] = 10; A[1] = 20; A[2] = 30; A[3] = 40; A[4] = 50; A[5] = 60;

        for(var x:A)
        
            System.out.print(x + " ");
        
        for(int i=(A.length-1); i>1; i--)
        
            A[i] = A[i-1];
        
        A[2] = 25;

        System.out.println("\n\n");

        for(var x:A)
  
            System.out.print(x + " ");
       
    } 
}

 */
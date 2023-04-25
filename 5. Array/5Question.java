/* Insert and Delete an element of an array */
//for Deleting length of array is compulsoary
class main
{
    public static void main(String[] args) {
        System.out.println("Practical Questions");
        System.out.println("-------------------");
        int A[] = new int[6];
        A[0] = 10; A[1] = 20; A[2] = 30; A[3] = 40; A[4] = 50; A[5] = 60;

        for(var x:A)
        {
            System.out.print(x + " ");
        }
        System.out.println("\n");

        for(int i = 2; i<5; i++)
        {
            A[i] = A[i+1];
        }
        A[5] = 0;
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
        int A[] = new int[6];
        A[0] = 10; A[1] = 20; A[2] = 30; A[3] = 40; A[4] = 50; A[5] = 60;

        for(var x:A)
            System.out.print(x + " ");

        System.out.println("\n");

        for(int i = 2; i<5; i++)
            A[i] = A[i+1];
        
        A[5] = 0;
        for(var x:A)
            System.out.print(x + " ");
    } 
}


 */
/* Coping an Array */
/* Reverse Coping an Array */
/* Increase size of  an Array */

/* Coping an Array */
class main
{
    public static void main(String[] args) {
        System.out.println("Practical Questions");
        System.out.println("-------------------");
        int A[] = {10,20,30,40,50};
        int B[] = new int[5];

        for(int i=0; i<5; i++)
        {
            B[i] = A[i];
        }

        for(var x:B)
        {
            System.out.print(x + " ");
        }
    } 
}

/* Reverse Coping an Array */
/* 
class main
{
    public static void main(String[] args) {
        System.out.println("Practical Questions");
        System.out.println("-------------------");
        int A[] = {10,20,30,40,50};
        int B[] = new int[5];

        for(int i=4; i>(0-1); i--)
        {
            B[4-i] = A[i];
        }

        for(var x:B)
        {
            System.out.print(x + " ");
        }
    } 
}

*/

 /*Reverse Copying an Array                             <----- Note this
    public static void main(String[] args) 
    {
        int A[]={8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[10];
        
        for(int i=A.length-1,j=0;i>=0;i++,j++)
        {
            B[j]=A[i];
        }
        
        for(int x:B)
        {
            System.out.println(x+",");
        }
    }*/
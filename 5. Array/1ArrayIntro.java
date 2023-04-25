class main
{

    public static void main(String[] args) {
        System.out.println("Different ways to declare an Array");
        System.out.println("------------------------------------");
        int A[] = new int[5];                 //first method
        int B[] = {10, 20, 30, 40, 50};     //Second method

        int C[];                            //declare array of reference
        C = new int[10];                    //Declare size of an object of array   
        
//Printing All Elements of array one by one
       for(int i=0; i<B.length; i++)
        {
            System.out.println(B[i]++);  
        }

        System.out.println("Address: " + B);              //address of B 
        System.out.println("Length: " + B.length);       //Length of B 

/* 
//using for each loop
        for(int x:A)
        {
            System.out.println(x);
        }
*/
    } 
}
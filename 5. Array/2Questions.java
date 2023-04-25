/* Finding sum of all element */
/* Searching an element */
/* Finding Maximum element */
/* Finding second largest element */
class main
{
    public static void main(String[] args) {
        System.out.println("Practical Questions");
        System.out.println("-------------------");
        int A[] = {3,9,7,8,12,6,15,5,4,10};
    

        int result = 0, MaxNo = A[0], SecondLar = A[0], SearchElement = A[0];
        for(int count:A)
        {
            //find sum of all element
            result  = result + count;

            //find search element
            if(count==6){
                SearchElement = count;
            }

            //find max no and second max no
            if(MaxNo<count){
                SecondLar = MaxNo;
                MaxNo = count;
            }
            else if(count>SecondLar) {
            SecondLar = count; 
            }
        }
        System.out.println("Sum of all Element: " + result);
        System.out.println("Maximum Element: " + MaxNo);
        System.out.println("Second Max Element: " + SecondLar);
        System.out.println("Search Element: " + SearchElement);

    } 
}
//Null Pointer Exception
import java.lang.*;

class main
{
    public static void main(String[] args) {
        
        try{
            String s1 = "Chandan";
            String s = null;

            System.out.println("Length is: " + s1.length());
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("Exception occur \n");
            System.out.println(e);
        }
    }
}
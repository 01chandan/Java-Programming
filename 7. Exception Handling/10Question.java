//Area of rectangle (Exception handle & user define Exception)
import java.lang.*;

class NegativeException extends Exception
{
    public String toString()
    {
        return "Area Cannot be Negative | Try Another number";
    }
}

class main
{
    public static int area(int l, int b) throws NegativeException
    {
        try{
            if(l<0 || b<0)
            {throw new NegativeException();}
        }
        catch(NegativeException e){
            System.out.println(e);
            return 0;
        }
        return l*b;
    }


    public static void main(String[] args) throws NegativeException {
        int l=10, b=-2;

        int result = area(l,b);
        System.out.println(result);
    }
}
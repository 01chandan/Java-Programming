//Number Format Exceeption (You can convert Character into Number but not word)
import java.lang.*;

class main
{
    public static void main(String[] args) {
        try {
            String s = "ABC";
            int i = Integer.parseInt(s); //convert String into Integer (not possible)

            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
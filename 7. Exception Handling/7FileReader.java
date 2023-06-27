//File Reader Exception Occur
import java.io.*;

class main
{
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("DateSheet.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
//File Input  & File Output Stream Exception

import java.io.*;

class main
{
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("abc1.txt");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
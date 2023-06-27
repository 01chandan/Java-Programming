//how to creating a new file in java
import java.lang.*;
import java.io.*;
import java.io.IOException;

class creatfile
{
    public static void main(String[] args) throws IOException {

        //creating file
        File file = new File("Sample.txt");
        
        if(!file.exists()){
            file.createNewFile();
        }

        //writing some text into the file by using FileOutputStream
        FileOutputStream Writtenobj = new FileOutputStream(file);
        String WrittenHere = "My Name is Chandan Kumar ";

        Writtenobj.write(WrittenHere.getBytes());
        Writtenobj.flush();
        Writtenobj.close();

        //Reading the Text from the file using FileInputStream
        



    }
}
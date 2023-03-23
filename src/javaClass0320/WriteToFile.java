package javaClass0320;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String args[]){
        String message = "This is a sample message.\n";

        File file = new File("test1.txt");
        FileWriter writer = null;

        try{
            writer = new FileWriter(file,true);
            writer.write(message);
            writer.flush();

            System.out.println("DONE");
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(writer != null) writer.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}

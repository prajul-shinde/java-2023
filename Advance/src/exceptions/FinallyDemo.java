package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class FinallyDemo {

    public static void main(String[] args) {
        FileReader reader = null;
        try {
             reader= new FileReader("file1.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally{
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}

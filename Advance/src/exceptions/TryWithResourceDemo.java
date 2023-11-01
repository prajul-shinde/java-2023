package exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceDemo {

    public static void main(String[] args) {
        try(
            var reader= new FileReader("File1.txt");
            var writer = new FileWriter("File2.txt");
        ) {
            reader.read();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

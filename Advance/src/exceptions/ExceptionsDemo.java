package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {

    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            System.out.println("file opened");
            var value = reader.read();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        catch(IOException ex){
            System.out.println("unable to read file");
        }

    }

}

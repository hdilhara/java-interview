package theory.io.filewrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        File file = new File("C:\\Users\\Thilina Dilhara\\Desktop\\test.txt");

        try(FileWriter fw = new FileWriter(file);) {
            String str = "Hi, I'm Thilina dilhara. \n I'm from Kiribathgoda, Sri Lanka.";
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

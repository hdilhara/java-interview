package theory.io.file_read;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Thilina Dilhara\\Desktop\\test.txt");
        if(file.exists()){

            try(FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {

                StringBuilder sb = new StringBuilder();
                while (br.ready()){
                    sb.append(br.readLine());
                }

                System.out.println(sb.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

}

package theory.collections.serialize_deserialize;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list  =  new ArrayList<>();
        List<String> list1 = null;

        Collections.addAll(list,"Banana", "Mango","Apple","Avacado","PineApple");

        File file = new File("C:\\Users\\Thilina Dilhara\\Desktop\\serilize.txt");

        //serialization
        try(FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos);){

            oos.writeObject(list);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Deserialization
        try(FileInputStream fis= new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis);) {

            list1 = (List<String>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(list1);

    }

}

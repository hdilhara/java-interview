package theory.threads.runtime;

import org.omg.SendingContext.RunTime;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Runtime runtime = Runtime.getRuntime();

        System.out.println("total memory "+runtime.totalMemory());
        System.out.println("free memory "+runtime.freeMemory());
        System.out.println("available processors memory "+runtime.availableProcessors());

        runtime.exec("notepad");

    }

}

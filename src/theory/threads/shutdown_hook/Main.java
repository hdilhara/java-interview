package theory.threads.shutdown_hook;

public class Main {

    /**
     *Shutdown hook use to do clenup work before the application get stop execution     *
     * */

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" hey, This is cleanup thread!");
        });
        runtime.addShutdownHook(t1);


        for(int i=0; i<100; i++){
            System.out.println(i);
        }

    }

}

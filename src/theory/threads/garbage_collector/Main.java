package theory.threads.garbage_collector;



public class Main {

    class Employee{

        Employee(){
            System.out.println("Empoyee created!");
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalized method have been called!");
        }
    }

    public static void main(String[] args) {

        Main mainObj =  new Main();
//        Main.Employee emp = mainObj.new Employee();

        mainObj.new Employee();

//        emp = null;
        System.gc();

    }

}

package theory.innerclasses;

public class Main {

    class Employee {
        int id;
        String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    static class Student{
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    Main mainObj = new Main();
    Main.Employee emp = mainObj.new Employee(23,"wewe");

    Main.Student std = new Main.Student(23,"dgfdg");

//    Main.Employee emp = mainObj.new Employee(211,"Thilina");

    public static void main(String[] args) {

    }


}

package theory.singelton;

class Employee{

    private Employee(){
        System.out.println("Employee is created!");
    }

    private static Employee empInstance = null;

    static Employee getEmployee(){
        if(empInstance == null){
            empInstance = new Employee();
        }

        return empInstance;
    }

    public void print(){
        System.out.println("Hello World!");
    }

}

public class Main {

    public static void main(String[] args) {

        Employee employee = Employee.getEmployee();
        Employee employee1 = Employee.getEmployee();

        employee.print();

    }

}

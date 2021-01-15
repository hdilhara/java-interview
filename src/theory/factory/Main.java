package theory.factory;

import java.util.EmptyStackException;

interface Employee{

    static Employee getEmployee(String employee){
        if(employee.equals("AnsellEmployee")){
            return new AnsellEmployee();
        }else
            return new MassEmployeee();
    }

    public void print();

}

class AnsellEmployee implements Employee {

    AnsellEmployee(){
        System.out.println("Ansell Employee Created!");
    }

    public void print(){
        System.out.println("Print Ansell Employee!");
    }
}

class MassEmployeee implements Employee {
    MassEmployeee(){
        System.out.println("Mass Employee Created!");
    }

    public void print(){
        System.out.println("Print Mass Employee!");
    }
}


public class Main {

    public static void main(String[] args) {
        Employee ansellEmployee = Employee.getEmployee("AnsellEmployee");
        Employee massEmployeee = Employee.getEmployee("MassEmployeee");

        ansellEmployee.print();
        massEmployeee.print();
    }

}

package theory.test;

class Animal{
    private void print(){
        System.out.println("Hi this is Animal Class!");
    }

    static void printMe(){
        System.out.println("Print Me! Animal");
    }

}

class Dog extends Animal{
    static void printMe(String  name){
        System.out.println("Print Me! Dog");
    }
}

public class Main {

    public static void main(String[] args) {
        Dog animal = new Dog();

        animal.printMe("dsd");
    }

}

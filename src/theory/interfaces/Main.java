package theory.interfaces;

interface Animal{

    static int i =888;

    static void staticMethod(){
        System.out.println("This is Animal interface static class!");
    }

    default void defaultMethod(){
        System.out.println("This is Animal Interface defaultmethod!");
    }

    void print();
}

class Dog implements Animal{
    @Override
    public void print() {
        System.out.println("Hi this is print() which is overrided!");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.print();
        dog.defaultMethod();
        Animal.staticMethod();

    }

}

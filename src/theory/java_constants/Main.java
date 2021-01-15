package theory.java_constants;

public class Main {

    static final int  CONST_VAL =55525;

    static {
        System.out.println("This is static block");
    }
    {
        System.out.println("This is annonymous block");
    }

    public static void main(String[] args) {

        System.out.println(CONST_VAL);



    }

}

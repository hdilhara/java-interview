package algorithems.recursion.get_sumof_number_secuence;

public class Main {

    public static void main(String[] args) {

        System.out.println(getSumOfSequence(100));

    }

    private static int getSumOfSequence(int i) {
        if(i==1)
            return 1;
        return getSumOfSequence(i-1)+i;
    }

}

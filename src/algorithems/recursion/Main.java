package algorithems.recursion;


/**
 * Call to the same funtion again and again until the function satisfies some condition
 **/

public class Main {
    public static void main(String[] args) {
        System.out.println("Find Factorial");
        int val = 1;
        val = findFactorial(val);
        System.out.println(val);
    }

    private static int findFactorial(int n) {
        if(n==1)
            return 1;
        return findFactorial(n-1)*n;
    }
}

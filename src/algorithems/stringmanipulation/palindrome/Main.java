package algorithems.stringmanipulation.palindrome;

public class Main {


    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(isPlindrome(str));
        String str1 = "MDJD";
        System.out.println(isPlindrome(str1));
        String str2 = "KAFAK";
        System.out.println(isPlindrome(str2));
    }

    private static boolean isPlindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().equals(str);
    }

}

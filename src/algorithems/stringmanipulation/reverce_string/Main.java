package algorithems.stringmanipulation.reverce_string;

public class Main {

    public static void main(String[] args) {

        String str =  "Reverce String!";

        System.out.println(str);
        System.out.println(reverceString(str));

        System.out.println(str);
        System.out.println(new StringBuilder(str).reverse().toString());

    }

    private static String reverceString(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i>=0; i-- ){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}

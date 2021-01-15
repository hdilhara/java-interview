package algorithems.stringmanipulation.rotation;

public class Main {

    public static void main(String[] args) {

        String str = "ADSF";
        System.out.println(str);
        System.out.println(rotation(str));
        System.out.println(rotationByConcat(str));

    }

    private static String rotationByConcat(String str) {
//        String str = "ABCDEFG";
//        System.out.println(str.substring(2,4));

        int l = str.length();
        str = str+str;
        str = str.substring(l-1,str.length()-1);
        return str;
    }

    private static String rotation(String str) {
        char c = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(i == 0)
                sb.append(str.charAt(str.length()-1));
            else
                sb.append(str.charAt(i-1));
        }
        return sb.toString();
    }

}

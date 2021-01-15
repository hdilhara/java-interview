package algorithems.stringmanipulation.countvowel;

public class Main {

    public static void main(String[] args) {

        String str = "dasvddf sgfUagngjyit";
        String vowels = "aeiou";

        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(vowels.contains(Character.toLowerCase(str.charAt(i))+""))
                count++;
        }
        System.out.println(count);

    }

}

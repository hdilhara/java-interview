package algorithems.find_missing_number;

public class Main {

    public static void main(String[] args) {

        int missingNum = 55;
        System.out.println(findMissingNum(getSumOfSequence(100)-missingNum));

    }

    private static int findMissingNum(int i) {
        return getSumOfSequence(100)-i;
    }

    private static int getSumOfSequence(int i) {
        if(i==1)
            return 1;
        return getSumOfSequence(i-1)+i;
    }

}

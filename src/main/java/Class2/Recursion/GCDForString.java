package Class2.Recursion;

public class GCDForString {

    private static String findGCB(String input1, String input2){
        if(!((input1+input2).equals(input2+input1))){
            return "";
        }
        int len1 = input1.length();
        int len2 = input2.length();
        int gcdLength = gcdRecursionHelper(len1, len2);
        if (len1 < len2) {
            return input1.substring(0, gcdLength);
        }
        return input2.substring(0,gcdLength);
    }

    private static int gcdRecursionHelper(int length1, int length2){
        if(length2 == 0){
            return length1;
        }
        return (length1%length2 == 0) ? length2 : gcdRecursionHelper(length2, length1%length2);
    }

    public static void main(String args[]){
       String input1 = "ABCABC";
       String input2 = "ABC";

       String gcdStringValid = findGCB(input1,input2);
       System.out.println("Valid gcdString = "+gcdStringValid);

       String input3 = "leet";
       String input4 = "code";

       String gcdStringInvalid = findGCB(input3,input4);
       System.out.println("Invalid gcdString 1 = "+gcdStringInvalid);

       String input5 = "ABABAB";
       String input6 = "ABAB";
        String gcdStringInvalid2 = findGCB(input5,input6);
        System.out.println("Invalid gcdString 2 = "+gcdStringInvalid2);
    }

}

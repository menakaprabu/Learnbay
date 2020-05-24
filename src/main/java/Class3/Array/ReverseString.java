package Class3.Array;

public class ReverseString {

    private static char[] reverseString(char[] inputStr){

        if(inputStr.length <= 0){
            return inputStr;
        }
        int fromFirst = 0;
        int fromLast = inputStr.length - 1;

        while(fromFirst < fromLast){
            char temp = inputStr[fromLast];
            inputStr[fromLast] = inputStr[fromFirst];
            inputStr[fromFirst] = temp;
            fromFirst++;
            fromLast--;
        }
        return inputStr;
    }

    public static void main(String[] args){
        char[] input = new char[]{'h','e','l','l','o'};
        char[] reverseChar = reverseString(input);
        for (int i=0;i<reverseChar.length;i++){
            System.out.println("Reverse char = " +reverseChar[i]);
        }

    }
}

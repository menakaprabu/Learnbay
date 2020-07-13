package Class2.Recursion;

public class StringPermutations {

    private static void printStringPermutations(String input, String answer){

        // If string is empty
        if (input.length() == 0) {
            System.out.print(answer + " ");
            return;
        }
        for(int i=0;i<input.length();i++){
            // ith character of str
            char ch = input.charAt(i);
            String ros = input.substring(0,i) + input.substring(i+1);
            printStringPermutations(ros, answer+ch);
        }

    }

    public static void main(String[] args){
        String input = "abc";
        printStringPermutations(input, "");
    }
}

package Class12.String;

public class PrintNextPattern {

    private static String printNextPattern(String input){
        String str = input + input;

        if((str.substring(1,str.length()-1)).contains(input)){
            return str.substring(input.indexOf(input.charAt(0)),input.length()+1);
        }
        return "Exception";
    }

    public static void main(String[] args){
        String input = "ababab";
        System.out.println(printNextPattern(input));
    }
}

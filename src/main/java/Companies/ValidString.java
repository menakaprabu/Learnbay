package Companies;

import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class ValidString {
   private static Map<Character,Character> mappings= new HashMap<Character, Character>();

    private static boolean isValidString(String input){
        // ({)}
        if(input.length()%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if(!stack.isEmpty()){
                Character charVal = stack.pop(); //(
                if(mappings.containsKey(input.charAt(i))){//)
                    if(mappings.get(input.charAt(i)) != charVal){
                        return false;
                    }
                }
            }else {
                stack.push(input.charAt(i));
            }

        }
        return true;
    }

    public static void main(String[] args){

        mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        String input = "()[]{}";
        boolean isValid = isValidString(input);
        System.out.println("is Valid = "+isValid);
    }
}

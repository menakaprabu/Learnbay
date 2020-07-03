package Class7.Stack;

import java.util.Stack;

public class StackParanthesis {

    private static boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){

                if(stack.size() > 0){
                    char top = stack.peek();
                    stack.pop();
                    if((top == '(' && s.charAt(i) == ')') || (top == '{' && s.charAt(i) == '}') || (top == '[' && s.charAt(i) == ']')){
                        continue;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args){
        String input = "()[{}]{}";
        boolean isValidParanthesis = isValid(input);
        System.out.println("isValidParanthesis = "+isValidParanthesis);
    }
}


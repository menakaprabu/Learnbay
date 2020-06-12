package Class7.Stack;

import java.util.Stack;

public class DeleteMiddleElement {

    private static Stack<Integer> deleteMidElemnt(Stack<Integer> input, int size, int curr){

        if(input.isEmpty() || curr == size){
            return input;
        }
       int element = input.pop();
       deleteMidElemnt(input, size, curr);

       if(curr != size/2){
           input.push(element);
       }
    return input;
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Stack<Integer> output = deleteMidElemnt(stack,stack.size(), 0);
        System.out.println("Output stack = "+stack.pop());

    }
}

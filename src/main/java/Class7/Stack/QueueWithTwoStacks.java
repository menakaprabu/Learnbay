package Class7.Stack;

import java.util.Stack;

public class QueueWithTwoStacks {

    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    public void add(int value){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.push(value);
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
}

package Companies.Lyft;

import java.util.Stack;

public class MaxStack {

    Stack<Integer> stack;
    Stack<Integer> maxStack;

    /** initialize your data structure here. */
    public MaxStack() {
        stack = new Stack();
        maxStack = new Stack();
    }

    public void push(int x) {
        int max = maxStack.isEmpty() ? x : maxStack.peek();
       if(max > x){
            maxStack.push(max);
        }else{
            maxStack.push(x);
        }
        stack.push(x);
    }

    public int pop() {
        maxStack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        int max = maxStack.peek();
        Stack<Integer> bufferStack = new Stack<>();
        while (top() != max) {
            bufferStack.push(pop());
        }
        pop();
        while (!bufferStack.isEmpty()) {
            push(bufferStack.pop());
        }
        return max;
    }

    public static void main(String[] args){
        MaxStack stack = new MaxStack();
        stack.push(5);
        stack.push(1);
        stack.push(7);
        stack.push(6);
        System.out.println("top = "+stack.top());
        System.out.println("peek max 1 = "+stack.popMax());
        System.out.println("peek max 2 = "+stack.popMax());
    }
}

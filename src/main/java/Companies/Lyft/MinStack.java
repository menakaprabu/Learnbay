package Companies.Lyft;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
        minStack = new Stack();
    }

    public void push(int x) {
        int min = minStack.isEmpty() ? x : minStack.peek();
        if(x <= min){
            minStack.push(x);
        }
        stack.push(x);
    }

    public int pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMin() {
        return minStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args){
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(1);
        stack.push(7);
        stack.push(6);
        System.out.println("top = "+stack.top());
        System.out.println("pop min 1st = "+stack.getMin());
        System.out.println("top = "+stack.pop());
        System.out.println("pop min 2nd = "+stack.getMin());
    }
}

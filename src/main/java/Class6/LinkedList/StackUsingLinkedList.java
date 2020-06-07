package Class6.LinkedList;

public class StackUsingLinkedList {

    Node head;

    int size;

    public StackUsingLinkedList(){
        head = null;
    }

    private Node createNode(int value){
        Node node = new Node(value);
        return node;
    }

    public void push(int value){
        Node newNode = createNode(value);

        newNode.nextPtr = this.head;
        this.head = newNode;
        size++;
    }

    public int pop() throws Exception{
        if(head != null) {
            size--;
            Node tempNode = head;
            this.head = this.head.nextPtr;
            return tempNode.value;
        }
        throw new Exception("Pop operation is not allowed for empty stack");
    }

    public int top() throws Exception{
        if(head != null) {
            size--;
            return head.value;
        }
        throw new Exception("Top operation is not allowed for empty stack");
    }

    public boolean search(int value){
        Node findNode = this.head;
        while(findNode != null && findNode.value != value){
            findNode = findNode.nextPtr;
        }
        if(findNode != null && findNode.value == value){
            return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size > 0){
            return false;
        }
        return true;
    }

    class Node{
        int value;
        Node nextPtr;

        Node(int value){
            this.value = value;
            this.nextPtr = null;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        //push
        stack.push(4);
        stack.push(6);
        stack.push(7);
        stack.push(9);

        //Pop
        try {
            int popValue = stack.pop();
            System.out.println("popValue = " + popValue);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Search: called search after deleting 6 to validate 6 has been removed or not
        boolean isFound = stack.search(6);
        System.out.println("Is found = "+isFound);

        //Count no. of elements
        int size = stack.size();
        System.out.println("size = "+size);

        //top
        try{
        int topValue = stack.top();
        System.out.println("TopValue = " + topValue);
        }catch (Exception e){
            e.printStackTrace();
        }

        boolean isEmpty = stack.isEmpty();
        System.out.println("is empty = "+isEmpty);
    }

}

package Class6.LinkedList;

public class HasCycle {

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);

        boolean hasCycle = linkedList.hasCycle();
        System.out.println("Has cycle = "+hasCycle);
    }

}

package Class6.LinkedList;

public class Node {

    int value;
    Node nextNodePtr;

    Node(int value){
        this.value = value;
        this.nextNodePtr = null;

    }

    public void insert(int value){
        Node newNode = new Node(value);
        Node currNode = this;
        while(currNode.nextNodePtr != null) {
            currNode = currNode.nextNodePtr;
        }
        currNode.nextNodePtr = newNode;

    }

    public void delete(Node node, int value){

        Node currNode = node, prev = null;

        while(currNode != null) {
            if(currNode.value == value){

            }

        }

    }
}

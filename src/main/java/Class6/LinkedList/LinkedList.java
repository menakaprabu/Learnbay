package Class6.LinkedList;

public class LinkedList {

    Node head;

    int size;

    public LinkedList(){
        head = null;
    }

    private Node createNode(int value){
        Node node = new Node(value);
        return node;
    }

    public void insert(int value){
        Node newNode = createNode(value);
        if(this.head == null){
            this.head = newNode;
            size++;
            return;
        }
        Node currNode = this.head;
        while (currNode.nextPtr != null){
            currNode = currNode.nextPtr;
        }
        currNode.nextPtr = newNode;
        size++;
    }

    public void insertAtHead(int value){
       Node newNode = createNode(value);
        newNode.nextPtr = this.head;
        this.head = newNode;
        size++;
    }

    public void deleteNode(int value){

        Node prev = null;
        Node findNode = this.head;
        while(findNode != null && findNode.value != value){
            prev = findNode;
            findNode = findNode.nextPtr;
        }
        if(findNode == null){
            return;
        }
        if(findNode == this.head){
            Node tempNode = this.head;
            this.head = this.head.nextPtr;
            tempNode.nextPtr = null;
        }else{
            prev.nextPtr = findNode.nextPtr;
            findNode.nextPtr = null;
        }
        size--;
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

    public int countElement(){
       return size;
    }

    class Node{

        int value;
        Node nextPtr;

        Node(int value){
            this.value = value;
            this.nextPtr = null;
        }
    }

    public void reverseLinkedList(){
        if(head == null){
            return;
        }
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null){
            next = curr.nextPtr;
            curr.nextPtr = prev;
            prev = curr;
            curr = next;
        }
        //This is to print. Return prev which is the reversed order
        curr = prev;
        while ((curr != null)){
            System.out.println("Reverse Link list = "+curr.value);
            curr = curr.nextPtr;
        }

    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //Insert
        linkedList.insert(4);
        linkedList.insert(6);
        linkedList.insert(7);
        linkedList.insert(9);

        //delete
        linkedList.deleteNode(6);

        //Search: called search after deleting 6 to validate 6 has been removed or not
        boolean isFound = linkedList.search(6);
        System.out.println("Is found = "+isFound);

        //Count no. of elements
        int size = linkedList.countElement();
        System.out.println("size = "+size);
    }

}

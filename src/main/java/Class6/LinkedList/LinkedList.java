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

    public Node insert(int value){
        Node newNode = createNode(value);
        if(this.head == null){
            this.head = newNode;
            size++;
            return head;
        }
        Node currNode = this.head;
        while (currNode.nextPtr != null){
            currNode = currNode.nextPtr;
        }
        currNode.nextPtr = newNode;
        size++;
        return head;
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

    //This is to find the middle element of the linked list.
    public int findMiddleElement(){
        Node fastPtr = head;
        Node slowPtr = head;

        while(fastPtr != null && fastPtr.nextPtr != null){
            slowPtr = slowPtr.nextPtr;
            fastPtr = fastPtr.nextPtr.nextPtr;
        }
        return slowPtr.value;
    }

    public int addTwoLinkedList(LinkedList list1, LinkedList list2){
        Node currNode1 = list1.head;
        Node currNode2 = list2.head;

        String value1 = "";
        while (currNode1 != null){
            value1 = value1 + currNode1.value+"";
            currNode1 = currNode1.nextPtr;
        }

        String value2 = "";
        while (currNode2 != null){
            value2 = value2 + currNode2.value+"";
            currNode2 = currNode2.nextPtr;
        }
        return Integer.parseInt(value1.trim()) + Integer.parseInt(value2.trim());
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

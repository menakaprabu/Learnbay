package Class6.LinkedList;

//Reverse the linked list
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL

//Step1: use 3 pointers: curr = head; prev = null; next = null;
//Step2: while loop: next = curr.next : curr.next = prev : prev = curr ; curr = next
public class ReverseLinkedList {

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        linkedList.reverseLinkedList();
    }
}

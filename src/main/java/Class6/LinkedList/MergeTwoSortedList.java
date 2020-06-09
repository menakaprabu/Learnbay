package Class6.LinkedList;

//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3->4->4
public class MergeTwoSortedList {
    public static void main(String[] args){
        LinkedList linkedList1 = new LinkedList();
        linkedList1.insert(1);
        linkedList1.insert(2);
        linkedList1.insert(4);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.insert(1);
        linkedList2.insert(3);
        linkedList2.insert(4);

        linkedList1.mergeTwoSortedList(linkedList1, linkedList2);
    }
}

package Class6.LinkedList;

//Add two link list
//1 → 2 → 3 → 4
//   5 → 9 → 9
// Add 1234 + 599 = 1833
public class AddTwoLinkedList {

    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);

        LinkedList list2 = new LinkedList();
        list2.insert(5);
        list2.insert(9);
        list2.insert(9);

        int addedValue = list2.addTwoLinkedList(list1, list2);
        System.out.println("Added value = "+addedValue);

    }

}

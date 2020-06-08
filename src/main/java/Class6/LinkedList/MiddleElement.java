package Class6.LinkedList;

//To find the middle element in the linked list
//Used slow - fast pointer algorithm. ITs also called Rabbit - Tortoise algorithm
public class MiddleElement {

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);

        int midElement = linkedList.findMiddleElement();
        System.out.println("Middle element = "+midElement);
    }

}

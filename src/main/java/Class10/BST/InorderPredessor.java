package Class10.BST;

public class InorderPredessor {

    private static int inOrderPredessor(Node root, Node inOrdePred, int value){

        if(root == null){
            return -1;
        }

        if(root.data < value) {
            inOrdePred = root;
            return inOrderPredessor (root.rightNode, inOrdePred, value);
        } else if(root.data > value){
            return inOrderPredessor (root.leftNode, inOrdePred, value);
        }
        else {
            if(root.leftNode != null) {
                inOrdePred = findInOrderInBelowTree (root.leftNode);
            }
        }
        return inOrdePred.data;
    }

    private static Node findInOrderInBelowTree (Node root) {
        while(root.rightNode != null) {
            root = root.rightNode;
        }
        return root;
    }

    /* Construct below binary search tree
                    15
                  /	\
                 /	  \
                10	   20
               /  	 /  \
              /	\   /	\
             8	 12 16	25
         */
    public static void main(String[] args){
        BST bst = new BST();
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

        Node root = null;
        for (int key : keys) {
            root = bst.createBST(root, key);
        }
        int prede = inOrderPredessor(root,null, 20);
        System.out.println("Predecessor = "+prede);
    }

}

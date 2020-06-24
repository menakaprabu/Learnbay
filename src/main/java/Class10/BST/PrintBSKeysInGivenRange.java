package Class10.BST;

public class PrintBSKeysInGivenRange {

    private static void printValuesInRange(Node node, int k1, int k2){
        if(node == null){
            return;
        }

        if(node.data > k1){
            printValuesInRange(node.leftNode,k1,k2);
        }
        if(node.data >= k1 && node.data <= k2){
            System.out.println("Value in range = "+node.data);
        }
        if(node.data < k2){
            printValuesInRange(node.rightNode,k1,k2);
        }

    }

    /* Construct below binary search tree
                   20
                 /	\
                /	  \
               8	   22
              / \
             /	 \
            4	 12
        */
    public static void main(String[] args){
        BST bst = new BST();
        int[] keys = {  20, 8, 4, 12, 22 };

        Node root = null;
        for (int key : keys) {
            root = bst.createBST(root, key);
        }
        printValuesInRange(root, 10, 22);
    }
}

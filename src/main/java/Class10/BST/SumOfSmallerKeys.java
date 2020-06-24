package Class10.BST;

public class SumOfSmallerKeys {

    static class Sum{
        int addvalue = 0;
    }

    /**
     *
     *                      9+6+3
     *                   /	\
     *                  /	  \
     *                 6+3	   15+9+6+3
     *                /  	    \
     *               /	       	\
     *              3	    	21+15+9+6+3
     * @param node
     * @param sum
     * @return
     */
    private static int sumOfKeys(Node node, Sum sum){
        if(node == null){
            return -1;
        }

        sumOfKeys(node.leftNode, sum);

        sum.addvalue = sum.addvalue + node.data;
        node.data = sum.addvalue;

        sumOfKeys(node.rightNode, sum);

        return sum.addvalue;
    }

    /* Construct below binary search tree
                    9
                  /	\
                 /	  \
                6	   15
               /  	    \
              /	       	\
             3	    	21
         */
    public static void main(String[] args){
        BST bst = new BST();
        int[] keys = {  9, 6, 3, 15, 21 };

        Node root = null;
        for (int key : keys) {
            root = bst.createBST(root, key);
        }
        Sum sum = new Sum();
        sumOfKeys(root,sum);
        System.out.println("sum of smaller keys = "+sum.addvalue);
    }

}

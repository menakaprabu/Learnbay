package Class9.BinaryTree;


/*
             1
         2      3
      4   5
*/
//Inorder (Left, Root, Right) : 4 2 5 1 3
//Preorder (Root, Left, Right) : 1 2 4 5 3
//Postorder (Left, Right, Root) : 4 5 2 3 1
public class InOrder {

    private static void InOrder(Node node){
        if(node == null){
            return;
        }
        /* then recur on left sutree */
        InOrder(node.leftNode);

        /* print data of node */
        System.out.print(node.data + " ");

        /* now recur on right subtree */
        InOrder(node.rightNode);



    }
    /*
                1
            2      3
         4   5

  */
    public static void main(String[] args){
        BinaryTreeTraversal binaryTree = new BinaryTreeTraversal();
        binaryTree.root = new Node(1);
        binaryTree.root.leftNode = new Node(2);
        binaryTree.root.rightNode = new Node(3);
        binaryTree.root.leftNode.leftNode = new Node(4);
        binaryTree.root.leftNode.rightNode = new Node(5);

        InOrder(binaryTree.root);

    }

}

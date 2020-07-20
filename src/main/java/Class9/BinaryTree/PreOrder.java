package Class9.BinaryTree;

/*
             1
         2      3
      4   5

*/
//Inorder (Left, Root, Right) : 4 2 5 1 3
//Preorder (Root, Left, Right) : 1 2 4 5 3
//Postorder (Left, Right, Root) : 4 5 2 3 1
public class PreOrder {

        private static void preOrder(Node node){
        if(node == null){
            return;
        }
            if (node == null)
                return;

            /* first print data of node */
            System.out.print(node.data + " ");

            /* then recur on left sutree */
            preOrder(node.leftNode);

            /* now recur on right subtree */
            preOrder(node.rightNode);
        }
    /*
                5
            10      20
         30   40  50   60
                     70
  */
        public static void main(String[] args){
        BinaryTreeTraversal binaryTree = new BinaryTreeTraversal();
        binaryTree.root = new Node(5);
        binaryTree.root.leftNode = new Node(10);
        binaryTree.root.rightNode = new Node(20);
        binaryTree.root.leftNode.leftNode = new Node(30);
        binaryTree.root.leftNode.rightNode = new Node(40);
        binaryTree.root.rightNode.leftNode = new Node(50);
        binaryTree.root.rightNode.rightNode = new Node(60);
        binaryTree.root.rightNode.rightNode.leftNode = new Node(70);

            preOrder(binaryTree.root);

    }

}

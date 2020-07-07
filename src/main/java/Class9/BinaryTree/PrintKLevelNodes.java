package Class9.BinaryTree;

public class PrintKLevelNodes {

    private static void printKLevelNodes(Node node, int k){
        if(node == null){
            return;
        }
        if(k == 0){
            System.out.println("Value = "+node.data);
            return;
        }else{
            printKLevelNodes(node.leftNode, k-1);
            printKLevelNodes(node.rightNode, k-1);
        }
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

        printKLevelNodes(binaryTree.root, 2);

    }
}

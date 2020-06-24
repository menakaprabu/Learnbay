package Class9.BinaryTree;

public class HeightOfTree {

    /*
                  5
              10      20
           30   40  50   60
                       70
    */
    private static int heightOfTree(Node node){
        if(node == null){
            return 0;
        }
        return (Math.max(heightOfTree(node.leftNode), heightOfTree(node.rightNode)))+1;
    }


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

        int height = heightOfTree(binaryTree.root);
        System.out.println("height = "+height);

    }

}

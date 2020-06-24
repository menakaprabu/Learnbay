package Class9.BinaryTree;

public class BinaryTreeTraversal {

    Node root;

    BinaryTreeTraversal(){
        root = null;
    }

    //Root Left Right
    private static void preOrderRecursion(Node node){
        if(node == null){
            return;
        }
        System.out.println("Pre order = "+node.data);
        preOrderRecursion(node.leftNode);
        preOrderRecursion(node.rightNode);
    }

    //Left Right Root
    private static void postOrderRecursion(Node node){
        if(node == null){
            return;
        }
        postOrderRecursion(node.leftNode);
        postOrderRecursion(node.rightNode);
        System.out.println("post order = "+node.data);
    }

    //Left Root Right
    private static void inOrderRecursion(Node node){
        if(node == null){
            return;
        }
        inOrderRecursion(node.leftNode);
        System.out.println("In order = "+node.data);
        inOrderRecursion(node.rightNode);
    }

    /*
                   5
               10      20
            30   40  50   60
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

        preOrderRecursion(binaryTree.root);
        System.out.println("\n");
        postOrderRecursion(binaryTree.root);//30, 40, 10, 50, 60, 20, 5
        System.out.println("\n");
        inOrderRecursion(binaryTree.root); //30, 10, 40, 5, 50, 20, 60
    }
}

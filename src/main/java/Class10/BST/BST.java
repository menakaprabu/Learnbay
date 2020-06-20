package Class10.BST;

public class BST {

    public Node createBST (Node root, int value) {
        if(root == null) {
            root = new Node(value);
            return root;
        }
        if(root.data < value) {
            root.rightNode = createBST (root.rightNode, value);
        }
        else {
            root.leftNode = createBST (root.leftNode, value);
        }
        return root;
    }

}

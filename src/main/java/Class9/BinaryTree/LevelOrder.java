package Class9.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    private static void levelOrder(Node node){
        if(node == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.println("Value = "+tempNode.data);
            if(tempNode.leftNode != null){
                queue.add(tempNode.leftNode);
            }
            if(tempNode.rightNode != null){
                queue.add(tempNode.rightNode);
            }
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

        levelOrder(binaryTree.root);

    }
}

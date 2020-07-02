package Companies;

import Class10.BST.BST;

import java.util.Queue;
import java.util.LinkedList;

public class LevelPrint {

    private static void levelPrint(Class10.BST.Node node){
        if(node == null){
            return;
        }
        Queue<Class10.BST.Node> queue = new LinkedList();
        queue.add(node);

        while(!queue.isEmpty()){
            Class10.BST.Node tempNode = queue.poll();
            System.out.println("Level Order values = "+tempNode.data);

            if(tempNode.leftNode != null){
                queue.add(tempNode.leftNode);
            }
            if(tempNode.rightNode != null){
                queue.add(tempNode.rightNode);
            }
        }
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

        Class10.BST.Node root = null;
        for (int key : keys) {
            root = bst.createBST(root, key);
        }

        levelPrint(root);
    }
}

package Companies.eBay;

import Companies.Lyft.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewTree {

    private static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        q.add(root);

        while(!q.isEmpty() && root != null) {
            result.add(q.peek().data);
            for(int i = q.size(); i > 0; i--) {
                root = q.poll();
                if(root.rightNode != null)
                    q.add(root.rightNode);
                if(root.leftNode != null)
                    q.add(root.leftNode);
            }
        }

        return result;
    }

    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(10);
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(30);
        treeNode.leftNode = treeNode1;
        treeNode.rightNode = treeNode2;
        treeNode2.rightNode = treeNode3;
        List<Integer> output = rightSideView(treeNode);
        for (int val:output) {
            System.out.println("value = "+val);
        }
    }
}

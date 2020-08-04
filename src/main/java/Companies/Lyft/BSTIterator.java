package Companies.Lyft;

import java.util.ArrayList;

public class BSTIterator {

    private static ArrayList<Integer> nodesSorted;
    private static int index;

    public BSTIterator(TreeNode root) {
        index = -1;
        nodesSorted = new ArrayList<>();
        // Call to flatten the input binary search tree
        this.inorder(root);
    }

    private static void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.leftNode);
        nodesSorted.add(root.data);
        inorder(root.rightNode);
    }
    /**
     * @return the next smallest number
     */
    public int next() {
        return nodesSorted.get(++index);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return this.index + 1 < this.nodesSorted.size();
    }


}

package Companies.eBay;

import Companies.Lyft.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SerializeDeserializeTree {

    public static String serialize(TreeNode root, String str) {
        // Recursive serialization.
        if (root == null) {
            str += "null,";
        } else {
            str += str.valueOf(root.data) + ",";
            str = serialize(root.leftNode, str);
            str = serialize(root.rightNode, str);
        }
        return str;
    }

    public static TreeNode deserialize(List<String> l) {
        // Recursive deserialization.
        if (l.get(0).equals("null")) {
            l.remove(0);
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
        l.remove(0);
        root.leftNode = deserialize(l);
        root.rightNode = deserialize(l);

        return root;
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
        return deserialize(data_list);
    }

    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode1.leftNode = treeNode2;
        treeNode1.rightNode = treeNode3;
        treeNode1.rightNode.leftNode = treeNode4;
        treeNode1.rightNode.rightNode = treeNode5;
        //treeNode2.leftNode = null;
        //treeNode2.rightNode = null;

        String serializedString = serialize(treeNode1, "");
        TreeNode outputTree = deserialize(serializedString);
        System.out.println("root ="+outputTree.data);
        System.out.println("root left ="+outputTree.leftNode.data);
        System.out.println("root right ="+outputTree.rightNode.data);
        System.out.println("root right left = "+outputTree.rightNode.leftNode.data);
        System.out.println("root right right ="+outputTree.rightNode.rightNode.data);

    }
}

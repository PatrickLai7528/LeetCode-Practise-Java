package Ex538ConvertBSTtoGreaterTree;

import UtilsClass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */
public class Solution {
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        iterate(root, list);
//        System.out.println(list);
        return root;
    }

    private void iterate(TreeNode node, ArrayList<TreeNode> list) {
        if (node == null) return;
        if (node.left != null) iterate(node.left, list);
        for (TreeNode t : list) {
            t.val += node.val;
        }
        list.add(node);
        if (node.right != null) iterate(node.right, list);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        solution.convertBST(root);
    }
}

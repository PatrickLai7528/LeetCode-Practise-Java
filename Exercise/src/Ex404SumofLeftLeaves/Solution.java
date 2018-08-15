package Ex404SumofLeftLeaves;

import UtilsClass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Find the sum of all left leaves in a given binary tree.
 * <p>
 * Example:
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        iterate(root, list, "");
        System.out.println(list);
        return list.isEmpty() ? 0 : list.getFirst().val;
    }

    private void iterate(TreeNode root, List<TreeNode> list, String leftOrRight) {
        if (root == null) return;
        if (root.left != null) iterate(root.left, list, "left");
        if (root.right != null) iterate(root.right, list, "right");
        if (leftOrRight.equals("left") && root.left == null && root.right == null) {
            for (TreeNode t : list) {
                t.val += root.val;
            }
            list.add(root);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        solution.sumOfLeftLeaves(root);
    }
}

package Ex563BinaryTreeTilt;

import UtilsClass.TreeNode;

import java.util.TreeMap;

/**
 *
 */
public class Solution {
    public int findTilt(TreeNode root) {
        if (root == null) return 0;
        if (root.right == null && root.left == null) return 0;
        if (root.right == null) {
            int value1 = Math.abs(sum(root.left));
            int value2 = findTilt(root.left);
            return value1 + value2;
        }
        if (root.left == null) {
            int value1 = Math.abs(sum(root.right));
            int value2 = findTilt(root.right);
            return value1 + value2;
        }
        int value1 = Math.abs(sum(root.left) - sum(root.right));
        int value2 = findTilt(root.left);
        int value3 = findTilt(root.right);
        return value1 + value2 + value3;
    }

    private int sum(TreeNode node) {
        if (node == null) return 0;
        if (node.left != null && node.right != null) return node.val + sum(node.left) + sum(node.right);
        if (node.left != null) return node.val + sum(node.left);
        return node.val + sum(node.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(solution.findTilt(root));

    }
}

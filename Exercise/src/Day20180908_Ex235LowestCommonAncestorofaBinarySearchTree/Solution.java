package Day20180908_Ex235LowestCommonAncestorofaBinarySearchTree;

import UtilsClass.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (p.val > root.val && q.val < root.val) {
            if (isHere(root.right, p) && isHere(root.left, q)) {
                return root;
            }
        } else if (q.val > root.val && p.val < root.val) {
            if (isHere(root.left, p) && isHere(root.right, q)) {
                return root;
            }
        } else if (root.val == q.val || root.val == p.val) {
            return root;
        } else if (q.val < root.val && p.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
        return null;
    }

    private Boolean isHere(TreeNode root, TreeNode p) {
        if (root == null) return false;

        if (root.val == p.val) {
            return true;
        } else if (p.val > root.val) {
            return isHere(root.right, p);
        } else {
            return isHere(root.left, p);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        System.out.println(solution.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)));
    }
}

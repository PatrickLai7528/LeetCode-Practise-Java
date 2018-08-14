package Ex653TwoSumIVInputisaBST;

import UtilsClass.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.
 * <p>
 * Example 1:
 * Input:
 * 5
 * / \
 * 3   6
 * / \   \
 * 2   4   7
 * <p>
 * Target = 9
 * <p>
 * Output: True
 * Example 2:
 * Input:
 * 5
 * / \
 * 3   6
 * / \   \
 * 2   4   7
 * <p>
 * Target = 28
 * <p>
 * Output: False
 */
public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return _findTarget(root, k, set);
    }

    private boolean _findTarget(TreeNode node, int k, Set<Integer> set) {
        System.out.println(set);
        if (node == null) return false;
        if (set.contains(k - node.val)) return true;
        set.add(node.val);
        return _findTarget(node.left, k, set) || _findTarget(node.right, k, set);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        System.out.println(solution.findTarget(root, 9));
    }
}

package Ex107BinaryTreeLevelOrderTraversalII;

import UtilsClass.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return Collections.emptyList();
        Queue<TreeNode> q1 = new LinkedList<>();
        LinkedList<List<Integer>> res = new LinkedList<>();
        q1.add(root);
        List<Integer> temp = new ArrayList<>();
        temp.add(root.val);
        res.addFirst(temp);
        while (!q1.isEmpty()) {
            Queue<TreeNode> q2 = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            while (!q1.isEmpty()) {
                if (!list.isEmpty()) {
                    res.addFirst(list);
                    list = new ArrayList<>();
                }
                System.out.println("q1 : " + q1.toString());
                System.out.println("q2 : " + q2.toString());
                TreeNode n = q1.remove();
                if (n.left != null) {
                    q1.add(n.left);
                    list.add(n.left.val);
                }
                if (n.right != null) {
                    q2.add(n.right);
                    list.add(n.right.val);
                }
            }
            System.out.println("stack1 : " + q1.toString());
            System.out.println("stack2 : " + q2.toString());
            q1 = q2;
            if (!list.isEmpty())
                res.addFirst(list);
        }
        return res;
    }

    public static void main(String[] arg) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(new Solution().levelOrderBottom(root));
    }
}

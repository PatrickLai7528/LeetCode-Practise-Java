package Day_2019_02_02;

import UtilsClass.TreeNode;

public class Ex437 {
    public int pathSum(TreeNode root, int sum) {
        return sum(root, 0, sum);
    }

    private int sum(TreeNode node, int ret, int left) {
        if (node.val == left) {
            ret += 1;
            return ret;
        }

        int sumLeft = 0;
        int sumRight = 0;
        if (node.left != null) {
            int newLeft = left;
            if (node.val < left || node.val < 0)
                newLeft -= node.val;

            sumLeft = sum(node.left, ret, newLeft);
        }

        if (node.right != null) {
            int newLeft = left;
            if (node.val < left || node.val < 0)
                newLeft -= node.val;
            sumRight = sum(node.right, ret, newLeft);

        }
        return ret + sumLeft + sumRight;
    }

    public static void main(String[] args) {
        Ex437 ex = new Ex437();
//        TreeNode root = new TreeNode(10);
//        root.left = new TreeNode(5);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(2);
//        root.left.left.left = new TreeNode(3);
//        root.left.left.right = new TreeNode(-2);
//        root.left.right.right = new TreeNode(1);
//        root.right = new TreeNode(-3);
//        root.right.right = new TreeNode(11);

        // input [5,4,8,11,null,13,4,7,2,null,null,5,1]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        System.out.println(ex.pathSum(root, 22));
    }
}

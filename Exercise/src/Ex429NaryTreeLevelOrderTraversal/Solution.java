package Ex429NaryTreeLevelOrderTraversal;

import UtilsClass.Node;

import java.util.*;

/**
 * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * <p>
 * For example, given a 3-ary tree:
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * We should return its level order traversal:
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * [
 * [1],
 * [3,2,4],
 * [5,6]
 * ]
 */
public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null)
            return Collections.emptyList();

        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> res1 = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Queue<Node> t = new LinkedList<>();
            ArrayList<Integer> res2 = new ArrayList<>();
            while (!q.isEmpty()) {
                Node n = q.remove();
                res2.add(n.val);
                n.children.stream().forEach(child -> t.add(child));
            }
            q = t;
            res1.add(res2);
        }
        return res1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Node node = new Node(1);
        node.children.add(new Node(3));
        node.children.add(new Node(2));
        node.children.add(new Node(4));
        node.children.get(0).children.add(new Node(5));
        node.children.get(0).children.add(new Node(6));
        System.out.println(solution.levelOrder(node));
    }
}

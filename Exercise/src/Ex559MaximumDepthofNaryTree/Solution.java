package Ex559MaximumDepthofNaryTree;

import UtilsClass.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a n-ary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * For example, given a 3-ary tree:
 * We should return its max depth, which is 3.
 * <p>
 * Note:
 * <p>
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */
public class Solution {
    public int maxDepth(Node root) {
        return _maxDepth(root, 0);
    }

    private int _maxDepth(Node root, int depth) {
        if (root == null)
            return depth;
        else {
            int max = depth + 1;
            List<Node> children = root.children;
            for (Node node : children) {
                int trial = _maxDepth(node, depth + 1);
                if (trial > max)
                    max = trial;
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Node root = new Node(1);
        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));
        System.out.print(solution.maxDepth(root));
    }
}

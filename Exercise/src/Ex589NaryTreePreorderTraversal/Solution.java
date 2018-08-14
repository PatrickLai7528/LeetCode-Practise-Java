package Ex589NaryTreePreorderTraversal;

import UtilsClass.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * <p>
 * For example, given a 3-ary tree:
 * <p>
 * <p>
 * <p>
 * <p>
 * Return its preorder traversal as: [1,3,5,6,2,4].
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        _preOrder(root, list);
        return list;
    }

    private void _preOrder(Node root, List<Integer> list) {
        if (root == null)
            return;

        list.add(root.val);
        root.children.stream().forEach(node -> _preOrder(node, list));
    }
}

package Ex590NaryTreePostorderTraversal;

import UtilsClass.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an n-ary tree, return the postorder traversal of its nodes' values.
 * <p>
 * <p>
 * For example, given a 3-ary tree:
 * <p>
 * Return its postorder traversal as: [5,6,3,2,4,1].
 */
public class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        _postOrder(root, list);
        return list;
    }

    private void _postOrder(Node root, List<Integer> list) {
        if(root == null) return ;
        for(Node child: root.children){
            _postOrder(child, list);
        }
        list.add(root.val);
    }
}

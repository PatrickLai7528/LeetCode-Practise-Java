package Ex872LeafSimilarTrees;

import UtilsClass.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.
 * <p>
 * <p>
 * <p>
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 * <p>
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * <p>
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 */
public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<TreeNode> leafList1 = new ArrayList<>();
        List<TreeNode> leafList2 = new ArrayList<>();
        throughTree(root1, leafList1);
        throughTree(root2, leafList2);
        if (leafList1.size() != leafList2.size())
            return false;
        else {
            for (int i = 0; i < leafList1.size(); i++) {
                if (leafList1.get(i).val != leafList2.get(i).val)
                    return false;
            }
        }
        return true;
    }

    private void throughTree(TreeNode node, List list) {
        if (node == null)
            return;

        if (isLeaf(node))
            list.add(node);
        else {
            throughTree(node.left, list);
            throughTree(node.right, list);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }
}

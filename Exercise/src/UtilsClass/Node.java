package UtilsClass;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    public Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public String toString() {
        return String.valueOf(this.val);
    }
};

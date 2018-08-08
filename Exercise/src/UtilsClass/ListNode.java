package UtilsClass;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val) + "->" + this.next;
    }
}

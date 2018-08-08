package Ex203RemoveLinkedListElements;

import UtilsClass.ListNode;

/**
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example:
 * <p>
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
//        node1.next.next = new ListNode(2);
//        node1.next.next.next = new ListNode(4);
//        node1.next.next.next.next = new ListNode(5);
//        node1.next.next.next.next.next = new ListNode(6);
        System.out.println(solution.removeElements(node1, 1));
    }
}

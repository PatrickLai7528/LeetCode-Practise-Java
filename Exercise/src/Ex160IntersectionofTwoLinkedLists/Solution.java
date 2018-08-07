package Ex160IntersectionofTwoLinkedLists;

import UtilsClass.ListNode;

import java.util.HashMap;
import java.util.List;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * <p>
 * <p>
 * For example, the following two linked lists:
 * <p>
 * A:          a1 → a2
 * ↘
 * c1 → c2 → c3
 * ↗
 * B:     b1 → b2 → b3
 * begin to intersect at node c1.
 * <p>
 * <p>
 * Notes:
 * <p>
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode cursorA = headA;
        ListNode cursorB = headB;
        while (cursorA.val != cursorB.val) {
            if (cursorA.next == null && cursorB.next == null)
                return null;
            if (cursorA.next == null) {
                cursorA = headB;
            } else {
                cursorA = cursorA.next;
            }
            if (cursorB.next == null) {
                cursorB = headA;
            } else {
                cursorB = cursorB.next;
            }
        }
        return cursorA;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        node1.next.next.next.next = new ListNode(5);
        ListNode node2 = new ListNode(6);
        node2.next = new ListNode(7);
        node2.next.next = new ListNode(8);
        node2.next.next.next = new ListNode(3);
        node2.next.next.next.next = new ListNode(4);
        node2.next.next.next.next.next = new ListNode(5);
        System.out.println(solution.getIntersectionNode(node1, node2));
    }
}

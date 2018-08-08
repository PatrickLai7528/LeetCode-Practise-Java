package Ex876MiddleoftheLinkedList;

import UtilsClass.ListNode;

import java.util.HashMap;

/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 * Example 2:
 * <p>
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        if (head == null)
            return null;

        ListNode cursor = head;
        int counter = 0;
        while (cursor != null) {
            map.put(counter, cursor);
            cursor = cursor.next;
            counter++;
        }
        System.out.println(map);
//        return map.size() % 2 != 0 ? map.get(map.size() / 2) : map.get(map.size() / 2);
        return map.get(map.size() / 2);
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
        System.out.println(solution.middleNode(node1));
        System.out.println(solution.middleNode(node2));
    }
}

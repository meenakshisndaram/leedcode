package Linkedlistcycle;

public class Solution {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Method to detect cycle in the linked list
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has one node
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle detected
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: Linked list with a cycle at position 1
        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle
        System.out.println("Example 1: " + solution.hasCycle(head1)); // Output: true

        // Example 2: Linked list with a cycle at position 0
        ListNode head2 = new ListNode(1);
        ListNode node2b = new ListNode(2);
        head2.next = node2b;
        node2b.next = head2; // Creates a cycle
        System.out.println("Example 2: " + solution.hasCycle(head2)); // Output: true

        // Example 3: Linked list with no cycle
        ListNode head3 = new ListNode(1); // Single node with no cycle
        System.out.println("Example 3: " + solution.hasCycle(head3)); // Output: false
    }
}

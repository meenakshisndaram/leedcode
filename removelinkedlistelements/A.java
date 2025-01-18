package removelinkedlistelements;
  class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node and set its next to head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Pointer to iterate through the list
        ListNode current = dummy;
        
        // Iterate through the list
        while (current.next != null) {
            // If the next node has the value to be removed
            if (current.next.val == val) {
                // Skip the node by pointing to the next of next
                current.next = current.next.next;
            } else {
                // Move to the next node if no removal is needed
                current = current.next;
            }
        }
        
        // Return the list starting from the next of dummy node
        return dummy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Create the linked list: [1, 2, 6, 3, 4, 5, 6]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        
        // Print the original list
        System.out.print("Original List: ");
        printList(head);
        
        // Remove elements with value 6
        ListNode modifiedList = solution.removeElements(head, 6);
        
        // Print the modified list
        System.out.print("Modified List: ");
        printList(modifiedList);
    }
    
    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
class shift{
    public static void main(String[] args) {
        int x=-7;
        System.out.println(x>>1);
        System.out.println(x>>>2);
    }
}
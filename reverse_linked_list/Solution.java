package reverse_linked_list;


import java.util.List;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode reverseList(ListNode head) {
          ListNode prev = null;
        ListNode current = head;


        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }


        return prev;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();


        ListNode l1 = new ListNode(10);
        l1.next = new ListNode(20);
        l1.next.next = new ListNode(30);
        l1.next.next.next = new ListNode(40);
        l1.next.next.next.next = new ListNode(50);


        ListNode reversed = solution.reverseList(l1);


        System.out.print("Reversed List: ");
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
    }
}

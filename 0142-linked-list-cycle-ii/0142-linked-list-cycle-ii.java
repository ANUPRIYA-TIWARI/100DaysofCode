/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Search it using loop
        // slow and fast pointers 
        while(fast!=null && fast.next!=null){
            // Move slow and fast 1
            // and 2 steps ahead
            // respectively.
            slow = slow.next;
            fast = fast.next.next;
            // slow == fast means, circle exist
            if(slow == fast){
                ListNode slow1 = head;
                // If loop exists. Start slow1 from
                // head and fast from meeting point.
                while(slow != slow1){
                    slow = slow.next;
                    slow1 = slow1.next;
                }
                return slow;
            }
        }
        return null;
    }
}
    

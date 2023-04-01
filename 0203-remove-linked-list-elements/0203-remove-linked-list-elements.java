/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
         if(head == null) return null;
        
        while(head!=null){
            if(head.val == val){
                head = head.next;
            }else{
                break;
            }
        }
        
        ListNode p = head;
        
        if(p == null) return null;
        
        while(p.next != null){
            if(p.next.val == val){
                ListNode q = p.next;
                p.next = q.next;
            }else{
                p = p.next;
            }
        }
        return head;
        
    }
}
        
    

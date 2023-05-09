/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // If any one of head is null i.e
        // no Intersection Point
        if(headA == null || headB == null){
            return null;
        }

        // Maintaining two pointers nodeA and nodeB
        // at the head of A and B,
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        
        while(nodeA!=nodeB){
            
            // When nodeA reaches the end of a list, then
            // reassign it to the headB.
            if(nodeA!=null){
                nodeA = nodeA.next;
            }else{
                nodeA = headB;
            }
            
            // When nodeB reaches the end of a list, then
            // reassign it to the headA.            
            if(nodeB!=null){
                nodeB = nodeB.next;
            }else{
                nodeB = headA;
            }
        }
        return nodeA;
    }
}
        
    

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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        ListNode curr = slow.next;
        ListNode next;
        
        slow.next = null;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        ListNode first = head;
        ListNode second = prev;
        
        ListNode nextF;
        ListNode nextS;
        
        while(first!=null && second!=null){
            nextF = first.next;
            first.next = second;
            nextS = second.next;
            second.next = nextF;
            
            first = nextF;
            second = nextS;
        }
    }
}
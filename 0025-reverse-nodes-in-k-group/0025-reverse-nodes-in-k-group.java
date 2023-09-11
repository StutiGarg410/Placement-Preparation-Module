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
    public int size(ListNode head){
        if(head==null){
            return 0;
        }
        if(head.next==null){
            return 1;
        }
        int p =0;
        ListNode curr = head;
        while(curr!=null){
            curr=curr.next;
            p++;
        }
        return p;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        int count=0;
        
        while(curr!=null && count<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next!=null && size(next)>=k){
            head.next=reverseKGroup(next, k);
        }else{
            head.next = next;
        }
        return prev;
        
    }
}
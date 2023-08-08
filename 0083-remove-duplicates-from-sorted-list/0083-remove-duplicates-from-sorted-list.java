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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = prev.next;
        while(curr!=null){
            if(prev.val!=curr.val){
                prev.next = curr;
                prev = curr;
                curr = prev.next;
            }else{
                curr = curr.next;
                if(curr==null){
                    prev.next = null;
                    return head;
                }
            }
        }
        prev.next = curr;
        return head;
    }
}
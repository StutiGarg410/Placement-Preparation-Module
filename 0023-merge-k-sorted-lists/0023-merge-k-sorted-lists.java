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
    public ListNode merge(ListNode list1, ListNode list2){
        ListNode newList = new ListNode();
        ListNode temp = newList;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }else{
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        while(list1!=null){
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }
        while(list2!=null){
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }
        return newList.next;
    }
    public ListNode mergeSort(ListNode lists[], int l, int r){
        if(l==r){
            return lists[l];
        }
        if(l+1==r){
            return merge(lists[l], lists[r]);
        }
        int mid = l+(r-l)/2;
        ListNode list1 = mergeSort(lists, l, mid);
        ListNode list2 = mergeSort(lists, mid+1, r);
            
        return merge(list1, list2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;
        }
        return mergeSort(lists, 0, lists.length-1);
    }
}
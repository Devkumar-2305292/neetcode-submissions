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
        ListNode orghead=head;
        

        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode curr=slow.next;
        ListNode prev=slow.next=null;
        ListNode next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode newhead=prev;
        while(newhead!=null){
            ListNode tmp1 = orghead.next;
            ListNode tmp2= newhead.next;
            orghead.next = newhead;
            newhead.next = tmp1;
            orghead=tmp1;
            newhead=tmp2;
        }
    }
}

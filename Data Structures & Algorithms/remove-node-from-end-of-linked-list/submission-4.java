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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        

        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        if(size==1){
            return null;
        }

        if(n==size){
            head=head.next;
            return head;
        }

        int x=size-n-1;
        ListNode prev=head;
        while(x!=0){
            x--;
            prev=prev.next;
        }

        prev.next=prev.next.next;

        return head;
    }
}

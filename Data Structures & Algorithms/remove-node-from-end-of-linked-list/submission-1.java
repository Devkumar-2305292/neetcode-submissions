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
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        //If n=1 delete last element
        if(n==1){
            if(len==1){
                return null;
            }
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            return head;
        }
        //If n=len delete head
        if(n==len){
            head=head.next;
            return head;
        }
        n=len-n;
        
        while(n!=1){
            temp=temp.next;
            n--;
        }
        temp.next=temp.next.next;

        return head;
    }
}

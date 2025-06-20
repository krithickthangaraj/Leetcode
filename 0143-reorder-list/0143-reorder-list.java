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
    public ListNode reverse(ListNode slow){
        ListNode curr=slow;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }
    public void reorderList(ListNode head) {
       if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode neww=reverse(slow);
        slow.next=null;

        ListNode first=head;
        ListNode second=neww;

        while(first.next!=null && second.next!=null){
            ListNode temp1=first.next,temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;


        }

    }
}
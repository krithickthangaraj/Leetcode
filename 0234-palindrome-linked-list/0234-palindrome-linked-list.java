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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;

        ListNode slow=head;
        ListNode fast=head;
        boolean res=true;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newlist=reverse(slow);
        ListNode currList=head;

        while(newlist!=null){
            if(newlist.val!=currList.val)
            {
                res=false;
                break;
            }
            newlist=newlist.next;
            currList=currList.next;

        }
        return res;
    }
}
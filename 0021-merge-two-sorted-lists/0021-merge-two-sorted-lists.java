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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res=new ListNode();
        ListNode temp=res;
        if(l1==null && l2==null) return res.next;
        else if(l1==null && l2!=null) return l2;
        else if(l1!=null && l2==null) return l1;

        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                temp.next=new ListNode(l1.val);
                l1=l1.next;
                temp=temp.next;
            }
            else{
                temp.next=new ListNode(l2.val);
                l2=l2.next;
                temp=temp.next;
            }
        }
        if(l1!=null) temp.next=l1;
        if(l2!=null) temp.next=l2;

        return res.next;
    }
}
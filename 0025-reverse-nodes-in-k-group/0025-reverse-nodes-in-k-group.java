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
    public ListNode reverseKGroup(ListNode head, int k) {
        // find the size of linkedlist if that succeeds K
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
            if(len >= k){
                break;
            }
        }

        if(len < k){
            return head;
        }

        // now we can reverse the linkedList
        temp = head;
        ListNode curr = head, prev = null;
        for(int i = 0; i < k; ++i){
            temp = temp.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        // prev is the new head
        head.next = reverseKGroup(temp, k);
        return prev;
    }
}
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
 //WHENEVER WE ARE REVERSING THE LINKED LIST FOCUS THAT WE ARE KEEPING PREV AS NULL
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head ;
        ListNode start = null;
        for(int i = 1 ; i< left ; i++){
                start = curr;
                curr = curr.next;          
        }
        ListNode leftNode = curr;
        ListNode prev = null;
        for(int i=left ; i<=right ;i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr ;
            curr = next;
        }
        if (start != null) {
            start.next = prev;
        } else {
            head = prev;
        }
        leftNode.next = curr ;
        return head;
    }
}
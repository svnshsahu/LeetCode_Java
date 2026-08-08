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
    public ListNode mergeNodes(ListNode head) {
        ListNode start = head.next ;
        ListNode dummy = new ListNode(0) ;
        ListNode curr = dummy ;

        int sum = 0 ;

        while(start != null){
            if(start.val  == 0){
                dummy.next = new ListNode(sum);
                dummy = dummy.next ;
                sum = 0 ;
            }else{
                sum += start.val ;
            }
            start = start.next ; 
        }
        return curr.next;
    }
}
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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return head.next;
        if(head.next.next == null) {
            head.next = null;
            return head;
        }

        int count = 1 ;
        ListNode start = head;
        while(start!=null){
            start = start.next;
            if(start!=null) count++;
        }
        count = count / 2 ;
        int temp = 1 ; 
        ListNode head2 = head ;
        while(head2.next!=null){
            if(temp == count){
                head2.next = head2.next.next ;
                break;
            }else{
                head2 = head2.next ;
                temp++;
            }
        }
        return head;
    }
}
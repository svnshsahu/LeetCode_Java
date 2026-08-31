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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        ans[0] = -1 ;
        ans[1] = -1 ;
        int first = -1 ;
        int last = -1 ;
        int count = 2 ;
        int secondLast = -1;
        int minDistance = Integer.MAX_VALUE;
        if(head == null || head.next == null || head.next.next == null) return ans ;
        ListNode prev = head ;
        ListNode curr = head.next ;
        ListNode sec = head.next.next ;

        while(sec!=null){
            if( (prev.val < curr.val && curr.val > sec.val) ||
                (prev.val > curr.val && curr.val < sec.val) ){
                if(first == -1) first = count ;
                else{
                    if(last == -1){
                        last = count ;
                        if(last-first < minDistance) minDistance = last-first ;
                    }
                    else{
                        secondLast = last ;
                        last = count ;
                        if(last - secondLast < minDistance) minDistance = last-secondLast ;
                    }
                }
            }
            prev = prev.next ;
            curr = curr.next ;
            sec = sec.next ;
            count++;
        }
        if(last - first <= 0){
            return ans;
        }
        ans[0] = minDistance ;
        ans[1] = last-first ;
        return ans;
    }
}
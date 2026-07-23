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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        ListNode temp = new ListNode(0);
        ListNode temp1 = temp;
        for(int i=0;i<lists.length;i++){
            temp1.next=lists[i];
            while(temp1.next!=null){
                temp1 = temp1.next;
            }
        }
        ListNode ans = temp.next;
        return divide(ans);
    }

    ListNode divide(ListNode ans){
        if(ans==null || ans.next==null) return ans;
        ListNode slow = ans ;
        ListNode fast = ans.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;

        ListNode left = divide(ans);
        ListNode right = divide(mid);

        return merge(left , right);

    }

    ListNode merge(ListNode left , ListNode right){
        ListNode answer = new ListNode(0);
        ListNode ans = answer;
        
        while(left!=null && right!=null){
            if(left.val<right.val){
                ans.next = left;
                left = left.next;
                ans = ans.next;
            }
            else{
                ans.next = right;
                right = right.next;
                ans = ans.next;
            }
        }
        while(left!=null){
            ans.next = left;
            left = left.next;
            ans = ans.next;
        }
        while(right!=null){
            ans.next = right;
            right = right.next;
            ans=ans.next;
        }
        return answer.next;
    }
}
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr =head;
        ListNode prev = null;
        int count=1;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                 count++;
                 curr=curr.next;
            }
            else{
                
                if(count==1){
                        prev=curr;
                      
                }
                else{
                    if(prev==null){
                        head = curr.next;
                    }
                    else{
                        prev.next = curr.next;
                    }
                    
                }
                curr = curr.next;
                count=1;
            }
        }
        if (curr != null && count > 1) {
            if (prev == null) {
                head = null;
            } 
            else {
                prev.next = null;
            }
        }
        return head;
    }
}
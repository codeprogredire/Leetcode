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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
            return null;
        
        ListNode temp=head;
        
        while(n-->0){
            temp=temp.next;
        }
        
        ListNode curr=head;
        ListNode prev=null;
        
        while(temp!=null){
            prev=curr;
            curr=curr.next;
            temp=temp.next;
        }
        
        if(prev==null)
            return head.next;
        
        prev.next=curr.next; //removing the nth node from end
        
        return head;
    }
}
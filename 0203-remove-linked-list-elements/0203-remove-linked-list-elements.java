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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        
        ListNode prev=null,begin=head;
        
        while(begin!=null && begin.val==val){
            begin=begin.next;
            if(prev==null)
                prev=head;
            else
                prev=prev.next;
        }
        
        head=begin; //new head
        
        ListNode curr=begin;
        
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
                curr=curr.next;
            }
            else{
                if(prev==null){
                    prev=head;
                }
                else{
                    prev=prev.next;
                }
                curr=curr.next;
            }
        }
        
        return head;
        
    }
}
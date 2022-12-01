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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null; //this is used to point to previous node
        ListNode curr=head; //this is used to point to current node
        ListNode next=null; //this is used to point to next node
        
        while(curr!=null){
            next=curr.next; //saving the address of next node
            curr.next=prev; //pointing the current node to its previous node
            
            //shifting
            prev=curr; //prev starts pointing to the current node
            curr=next; //curr start pointing to next node
        }
        
        return prev; //prev becomes the new head of reversed linked list, so we return it
        
    }
}
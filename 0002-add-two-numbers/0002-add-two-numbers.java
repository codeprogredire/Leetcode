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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;
        
        ListNode curr1=l1,curr2=l2;
        
        int carry=0;
        
        while(curr1!=null && curr2!=null){
            int sum=(curr1.val+curr2.val+carry)%10;
            carry=(curr1.val+curr2.val+carry)/10;
            ans.next=new ListNode(sum,null);
            ans=ans.next;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        
        while(curr1!=null){
            int sum=(curr1.val+carry)%10;
            carry=(curr1.val+carry)/10;
            ans.next=new ListNode(sum,null);
            ans=ans.next;
            curr1=curr1.next;
        }
        
        while(curr2!=null){
            int sum=(curr2.val+carry)%10;
            carry=(curr2.val+carry)/10;
            ans.next=new ListNode(sum,null);
            ans=ans.next;
            curr2=curr2.next;
        }
        
        if(carry==1){
            ans.next=new ListNode(1,null);
        }
        
        return dummy.next;
    }
}
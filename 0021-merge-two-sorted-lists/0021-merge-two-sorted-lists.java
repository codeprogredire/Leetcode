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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1); //Creating a dummy node
        
        //tail points to dummy node. The tail node will be used to
        // append all the nodes in sorted order
        ListNode tail=dummy; 
        
        ListNode curr1=list1; //points to head of first list
        ListNode curr2=list2; //points to head of second list
        
        while(curr1!=null && curr2!=null){
            //if list1 element is less thatn or equal to list2 element
            if(curr1.val <= curr2.val){
                ListNode nextnode=curr1.next; //stores address of next node
                curr1.next=null; //separate the current node from rest of list
                
                tail.next=curr1; //appends the node to tail
                curr1=nextnode; //curr1 points to next node in list1
            }
            else{
                ListNode nextnode=curr2.next; //stores address of next node
                curr2.next=null; //separate the current node from rest of list
                
                tail.next=curr2; //appends the node to tail
                curr2=nextnode; //curr2 points to next node in list2
            }
            tail=tail.next; //tail points to the last element of the list
        }
        
        //if some nodes are present in list1 then add it to the tail list
        if(curr1!=null)
            tail.next=curr1;
        
        //if some elements are present in list2, then add it to tail list
        if(curr2!=null)
            tail.next=curr2;
        
        return dummy.next; //return the head of the merged list
    }
}
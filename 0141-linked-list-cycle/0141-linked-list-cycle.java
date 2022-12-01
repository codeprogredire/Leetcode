/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head; //for traversing the ll one node at a time
		ListNode fast=head; //for traversing every alternate node
        
        if(head==null)
            return false;
        
		while(fast.next!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
            
            if(slow==fast) //cycle detected
				return true;
		}

		return false; //no cycle
        
    }
}
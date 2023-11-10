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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }

        ListNode sorted=new ListNode(0);  // dummy yaar
        ListNode current=head;
        
        while(current!=null)
        {
            ListNode next=current.next;
            ListNode prev=sorted;
            ListNode insert=sorted.next;
        while(insert!=null && insert.val<current.val)   
        {
            prev=insert;
            insert=insert.next;
        }

            current.next = insert;
            prev.next = current;
            current = next;
            
        }
        return sorted.next;
    }
}
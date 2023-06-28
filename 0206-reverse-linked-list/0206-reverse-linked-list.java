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
        ListNode prevNode=null;
        ListNode currNode=head;
        ListNode next;
        while(currNode!=null){
            next=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=next;
        }
         head=prevNode;
         return prevNode ;
        
    }
}
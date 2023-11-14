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
    public ListNode rotateRight(ListNode head, int k) {
          if(head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode preHead = new ListNode(0);
        preHead.next = head;

        ListNode endNode = preHead;
        int len = 0;
        while(endNode.next != null) {
            endNode = endNode.next;
            len++;
        }
        if(k % len == 0) {
            return head;
        }
        
        ListNode tracker = preHead;
        for(int split = len - k % len; split > 0; split--) {
            tracker = tracker.next;
        }

        endNode.next = preHead.next;
        preHead.next = tracker.next;
        tracker.next = null;
        
        return preHead.next;
        
    }
}
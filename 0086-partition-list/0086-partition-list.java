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
    public ListNode partition(ListNode head, int x) {
           if( head == null || head.next == null ){
            return head;
        }

        ListNode less = new ListNode(-1);
        ListNode curLess = less;

        ListNode gtr = new ListNode(-1);
        ListNode curGtr = gtr;

        while( head != null )
        {
            if( head.val < x ){
                curLess.next = head;
                curLess = head;
            }
            else{
                curGtr.next = head;
                curGtr = head;
            }

            head = head.next;
        }

        curLess.next = gtr.next;
        curGtr.next = null;
        head = less.next;

        return head;
    }
}
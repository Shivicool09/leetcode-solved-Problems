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
    int power;
    public int getDecimalValue(ListNode head) {
        
        if(head==null)
        {
            power = 1;
            return 0;
        }
        int res = getDecimalValue(head.next) ;
        int bit = head.val;
        res = res + (power*bit);
        power = power*2;
        return res;
    }
}
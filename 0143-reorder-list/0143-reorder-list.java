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
    public void reorderList(ListNode head) {
         if (head == null || head.next == null) return;
         Stack<ListNode> st=new Stack<>();
         ListNode curr=head;
      
         while(curr!=null)
         {
             st.push(curr);
             curr=curr.next;
            
         }
         int size = st.size() / 2;
         curr=head;

        while (size-- > 0) {
            ListNode top = st.pop();
            ListNode temp = curr.next;

            curr.next = top;
            curr = temp;
            top.next = temp;
        }

        curr.next = null;
        
    }
}
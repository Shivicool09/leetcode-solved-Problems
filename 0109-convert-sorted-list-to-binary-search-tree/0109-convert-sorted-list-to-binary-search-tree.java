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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
        return null;
        return sortedList(head,null);
    }
    public TreeNode sortedList(ListNode low,ListNode high){
        if(low==high)
        return null;
        ListNode mid=findmid(low,high);
        TreeNode root=new TreeNode(mid.val);
        root.left=sortedList(low,mid);
        root.right=sortedList(mid.next,high);
        return root;
    }
    public ListNode findmid(ListNode low,ListNode high){
        ListNode slow=low,fast=low;
        while(fast!=high && fast.next!=high){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
}
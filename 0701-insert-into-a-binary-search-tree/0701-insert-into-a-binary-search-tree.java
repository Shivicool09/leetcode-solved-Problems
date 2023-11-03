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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode  node = new TreeNode(val);
        if(root==null) return node;
        TreeNode parent = null, current=root;
        while(current!=null)
        {
            parent  = current;

            if(current.val< node.val)
            current = current.right;
            
            else current = current.left;
        }
        if(parent.val<node.val)
            parent.right = node;
            else parent.left = node;
            return root;
        
    }
}
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
    public TreeNode searchBST(TreeNode root, int val) {
         TreeNode node = dfs(root, val);
        return (node == null || (node.val == root.val && root.val != val)) ? null : node;
    }
    
    public TreeNode dfs(TreeNode node, int val) {
        if (node == null)
            return node;
        
        TreeNode left = dfs(node.left, val);
            
        if (left != null && left.val == val)
            return left;
            
        TreeNode right = dfs(node.right, val);
            
        if (right != null && right.val == val)
            return right;
        
        return node;
    }
}
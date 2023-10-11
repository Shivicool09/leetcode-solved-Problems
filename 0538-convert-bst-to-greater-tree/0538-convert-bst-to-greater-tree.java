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
    static  int cur = 0;
    public TreeNode convertBST(TreeNode root) {
        cur = 0;
        help(root);
        return root;
    }
    public void help(TreeNode root) {
        if(root!= null){
            help(root.right);
            cur += root.val;
            root.val = cur;
            help(root.left);
        }
    }
}
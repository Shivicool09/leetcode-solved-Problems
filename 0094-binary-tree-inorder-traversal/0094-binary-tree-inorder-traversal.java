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
    public List<Integer> intHelper(TreeNode root,List<Integer> list) {
        if(root==null) return list;
        
        intHelper(root.left,list);
        list.add(root.val);
        intHelper(root.right,list);
        return list;
        
        
        
    }
    public List<Integer>inorderTraversal(TreeNode root){
        List<Integer>list=new ArrayList<>();
        return intHelper(root,list);
    }
}
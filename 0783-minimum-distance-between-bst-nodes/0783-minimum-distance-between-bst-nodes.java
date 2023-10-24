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
    int min=Integer.MAX_VALUE;
    ArrayList<Integer> res=new ArrayList<>();
    public void solve(TreeNode node){
        if(node==null){
            return; 
        }
        solve(node.left);
        res.add(node.val);
        solve(node.right);
        
    }
    public int minDiffInBST(TreeNode root) {
        solve(root);
        for(int i=1;i<res.size();i++){
            int ans=Math.abs(res.get(i)-res.get(i-1));
            if(ans<min){
                min=ans;
            }
        }
        return min;
    }
}
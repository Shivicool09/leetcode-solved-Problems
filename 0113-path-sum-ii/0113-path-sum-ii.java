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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         List<Integer> path = new ArrayList<>();
				List<List<Integer>> paths = new ArrayList<>();
				helper(root,targetSum,path,paths);	
		  		return paths;      
    }
     void helper(TreeNode root, int targetSum, List<Integer> path,List<List<Integer>> paths) {
		if(root==null) {
			return ;
		}
		path.add(root.val);
		
		
		if(root.val==targetSum && root.left==null && root.right==null) {
			paths.add(new ArrayList<>(path));
		}else {
			//recursion call 
			helper(root.left,targetSum-root.val,path,paths);
			helper(root.right,targetSum-root.val,path,paths);
		}
		 
		 
		 path.remove(path.size()-1);
        
    }
}
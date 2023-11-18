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
    public void flatten(TreeNode root) {
        if(root==null){return;}
    TreeNode rootrightpart=root.right;
    LinkedList<TreeNode> leftpart=new LinkedList<>();
    preorder(root.left,leftpart);
    root.left=null;
    for(int i=0;i<leftpart.size();i++){
    root.right=leftpart.get(i);
    root=root.right;}

    LinkedList<TreeNode> rightpart=new LinkedList<>();
    preorder(rootrightpart,rightpart);
    root.right=null;
    for(int i=0;i<rightpart.size();i++){
    root.right=rightpart.get(i);
    root=root.right;}

    }
    

    public void preorder(TreeNode root,LinkedList<TreeNode> leftpart){
        if(root==null){return;}
    leftpart.add(root);
    preorder(root.left,leftpart);
    root.left=null;
    preorder(root.right,leftpart);
    root.right=null;
    return;

    }

        
    }
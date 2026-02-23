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
    public int maxDepth(TreeNode root) {
        
       return depth(root,0);
        
    }
    public static int depth(TreeNode root,int count){
        if(root==null){
            return count;
        }
        count++;
        int lh=depth(root.left,count);
        int rh=depth(root.right,count);
        return Math.max(lh,rh);
        
    }
    
}
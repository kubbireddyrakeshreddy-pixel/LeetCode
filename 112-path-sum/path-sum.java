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
    public boolean hasPathSum(TreeNode root, int targetSum) {
      
      
      boolean res=pathsum(root,0,targetSum);
      return res;
        
    }
    public boolean pathsum(TreeNode root,int sum,int target){
             if(root==null){
           return false;
            } 
            
            sum+=root.val;
           
           if(root.left==null && root.right==null && sum==target ){
                return true;
            }
            
           return  pathsum(root.left,sum,target)||pathsum(root.right,sum,target);
           
    }

}
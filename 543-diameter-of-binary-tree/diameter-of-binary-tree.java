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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
       
        
      
        
        depth(root, max);
       //arr[0]=depth(root.left,arr[0])+depth(root.right,arr[0]);
        return max;
    }
    public  int depth(TreeNode root,int count){
        if(root==null){
            return 0;
        }
       
        int lh=depth(root.left,count);
        int rh=depth(root.right,count);
        max=Math.max(max, lh+rh);
        return 1+Math.max(lh,rh); 
        
    }
}
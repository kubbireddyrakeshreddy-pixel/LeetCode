/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ls=null;
    TreeNode rs=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        else if(p.val < root.val && q.val<root.val){
           ls=lowestCommonAncestor(root.left,p,q);
        }
        else if(p.val>root.val && q.val>root.val){
            rs=lowestCommonAncestor(root.right,p,q);
        }
        else if(p.val==root.val || q.val==root.val){
            return root;
        }
        else{
            return root;
        }
        return ls==null?rs:ls;
    }
}



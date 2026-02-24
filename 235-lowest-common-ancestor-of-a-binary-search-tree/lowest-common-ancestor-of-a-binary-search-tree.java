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
    TreeNode dir=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        else if(p.val < root.val && q.val<root.val){
          dir=root.left;
        }
        else if(p.val>root.val && q.val>root.val){
           dir=root.right;
        }
        else if(p.val==root.val || q.val==root.val){
            return root;
        }
        else{
            return root;
        }
        return lowestCommonAncestor(dir,p,q);
    }
}



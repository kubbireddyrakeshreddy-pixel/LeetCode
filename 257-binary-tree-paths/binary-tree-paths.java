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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        if(root!=null){
        help(res,root,"");
        }
        return res;
        

        }
        public void help(List<String> res,TreeNode root,String path){
                     if(path.isEmpty()){
                        path+=root.val;
                     }
                     else{
                        path+="->"+root.val;
                     }
                   if(root.left==null && root.right==null){
                    res.add(path);
                    return;
                   }
                   if(root.left!=null){
                     help(res,root.left,path);
                   }
                   if(root.right!=null){
                        help(res,root.right,path);
                   }
        }
    }

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
      List<String> res=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
      
        if(root!=null){
        help(root,"");
        }
        return res;
        

        }
        public void help(TreeNode root,String path){
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
                     help(root.left,path);
                   }
                   if(root.right!=null){
                        help(root.right,path);
                   }
        }
    }

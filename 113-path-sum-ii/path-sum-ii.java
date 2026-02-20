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
    List<Integer>l=new ArrayList<>();
   
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> li=new ArrayList<>();
    return  path(root,0,targetSum,li);
        
    }
    public  List<List<Integer>> path(TreeNode root,int sum,int target,List<List<Integer>> li){
            if(root==null){
                return li;
            }
            sum+=root.val;
            l.add(root.val);
           
             
           if(root.left==null && root.right==null && sum==target ){
                 li.add(new ArrayList<>(l));
                 
           
            }
            
            path(root.left,sum,target,li);
            path(root.right,sum,target,li);
              l.remove(l.size() - 1);

            return li;
            

    }

    
}
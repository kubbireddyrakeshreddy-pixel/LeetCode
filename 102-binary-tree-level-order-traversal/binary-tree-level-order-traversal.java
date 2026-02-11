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
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode left;
        TreeNode right;
       TreeNode current=root;
        List<Integer> level;
        List<List<Integer>> list=new ArrayList();
        Deque<TreeNode> q=new ArrayDeque<>();
        int k=0;
        
        if(root==null){
            return list;
        }
        else{
            q.offer(current);
        }
        while(!q.isEmpty()){
            int size=q.size();
            level=new ArrayList<>();
            for(int i=0;i<size;i++){
                current=q.poll();
                level.add(current.val);
                  if(current.left!=null) q.offer(current.left);
                  if(current.right!=null) q.offer(current.right);
                  }
        list.add(level);
        
     

        }
        
       return list; 
        
    }
}
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
  
     int height(TreeNode root){
          if(root ==null){
              return 0;
          }
      int lh = height(root.left);
         int rh = height(root.right);
        
    return Math.max(lh ,rh)+1;
     }
    
    public boolean isBalanced(TreeNode root) {
         if(root == null){
             return true;
         }
         int lh = height(root.left);
        int rh = height(root.right);
        
        if(Math.abs(lh-rh) <=1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        return false;
    }
}
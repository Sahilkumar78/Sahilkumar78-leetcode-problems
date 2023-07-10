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
       TreeNode node = new TreeNode(0);
        TreeNode ptr = node;
    
    public void inorder(TreeNode root){
           if(root == null){
               return;
           }
            inorder(root.left);
             node.right = new TreeNode(root.val);
              node = node.right;
           inorder(root.right);
    }
    
    
    
    public TreeNode increasingBST(TreeNode root) {
      inorder(root); 
      return ptr.right;
    
    }
}
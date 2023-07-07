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
     public static void inorder(TreeNode root ,ArrayList<Integer>arr){
         if(root == null){
             return;
         }
          inorder(root.left, arr);
           arr.add(root.val);
         inorder(root.right, arr);
         
     }
    
    
    public int kthSmallest(TreeNode root, int k) {
        if(root== null) return 0;
         
        ArrayList<Integer> arr = new ArrayList<>();
        //inorder traversal
         inorder(root , arr);
        return arr.get(k-1);
      
    }
}
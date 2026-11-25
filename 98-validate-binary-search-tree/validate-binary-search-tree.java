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
    TreeNode prev = null;
    boolean ans = true;

    public void fun(TreeNode root){
        if(root == null || !ans){
            return;
        }

        fun(root.left);

        //logic
        
        if(prev!=null && prev.val >= root.val ){
            ans = false;
            return;
        }
        prev=root;

        fun(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        prev = null;
        ans = true;

        fun(root);

        return ans;
    }
}
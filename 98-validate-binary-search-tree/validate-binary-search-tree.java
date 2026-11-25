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
    Boolean ans = true;

    public void fun(TreeNode root){
        if(root == null){
            return;
        }

        fun(root.left);

        //logic
        if(root == null){
            return;
        }
       

        if(prev!=null && prev.val >= root.val ){
            ans = false;
            return;
        }
        prev=root;

        fun(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        prev = null;

        fun(root);

        return ans;
    }
}
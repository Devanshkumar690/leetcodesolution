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
    TreeNode ans = null;

    public void fun(TreeNode root,int k){
        if(root == null){
            return;
        }
        if(root.val == k){
            ans = root;
            return;
        }
        if(root.val > k){
            fun(root.left,k);
        }
        else{
            fun(root.right,k);
        }

    }


    public TreeNode searchBST(TreeNode root, int val) {
        
        ans = null;

        fun(root,val);

        return ans;
        
    }
}
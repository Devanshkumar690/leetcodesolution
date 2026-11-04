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

    public boolean fun(TreeNode root,int tSum,int sum) {
        if(root == null) {
            return false;
        }

        sum = sum + root.val;

        // Leaf node
        if(root.left == null && root.right == null) {
            return sum == tSum;
        }

        boolean left = fun(root.left, tSum, sum);
        boolean right = fun(root.right, tSum, sum);

        return left || right;
    

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        int sum=0;
        return fun(root,targetSum,sum);
    }
}
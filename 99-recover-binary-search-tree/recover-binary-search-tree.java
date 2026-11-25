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
    TreeNode first = null;
    TreeNode second = null;

    public void fun(TreeNode root) {
        if (root == null) {
            return;
        }

        fun(root.left);

        if (prev != null && root.val < prev.val) {
            if (first == null) {
                first = prev;
            }

            second = root;
        }

        prev = root;

        fun(root.right);
    }

    public void recoverTree(TreeNode root) {
        prev = null;
        first = null;
        second = null;

        fun(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}

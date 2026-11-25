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

    int wrong = 0;

    TreeNode g1First = null;
    TreeNode g1Second = null;

    TreeNode g2First = null;
    TreeNode g2Second = null;

    public void fun(TreeNode root){
        if(root == null){
            return;
        }
        fun(root.left);

        //logic

        if(prev == null){
            prev = root;
        }
        else{
            if(root.val < prev.val){
                if(wrong == 0){
                    g1First = prev;
                    g1Second = root;
                    wrong++;
                }
                else{
                    g2First = prev;
                    g2Second = root;
                    wrong++;
                }
            }
            
            prev = root;
        }

        fun(root.right);


    }

    public void recoverTree(TreeNode root) {
        prev = null;

        wrong = 0;

        g1First = null;
        g1Second = null;

        g2First = null;
        g2Second = null;


        fun(root);
        if(wrong == 1){
            int temp = g1First.val;
            g1First.val = g1Second.val;
            g1Second.val = temp;
        }
        else{
            int temp = g1First.val;
            g1First.val = g2Second.val;
            g2Second.val = temp;
        }
    }
}
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
    List<Integer> dairy = new ArrayList<>();

    List<List<Integer>> ans = new ArrayList<>();

    public void fun(TreeNode root , int sum , List<Integer> dairy , int tSum, List<List<Integer>> ans){
        if(root == null){
            return;
        }

        sum = sum + root.val;

        dairy.add(root.val);

        if(root.left == null && root.right == null){
            if(sum == tSum){
                ans.add(new ArrayList<>(dairy));
           
            }
        }
        fun(root.left,sum,dairy,tSum,ans);
        fun(root.right,sum,dairy,tSum,ans);
        dairy.remove(dairy.size()-1);

        return;
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        
       dairy = new ArrayList<>();

       ans = new ArrayList<>();

       fun(root,0,dairy,targetSum,ans);

       return ans;
    }
}
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
   

    public void fun(TreeNode root ,List<Integer> dairy , int tSum, List<List<Integer>> ans){
        if(root == null){
            return;
        }

        tSum -= root.val;

        dairy.add(root.val);

        if(root.left == null && root.right == null){
            if(tSum == 0){
                ans.add(new ArrayList<>(dairy));
           
            }
        }
        fun(root.left,dairy,tSum,ans);
        fun(root.right,dairy,tSum,ans);
        dairy.remove(dairy.size()-1);

        return;
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        
        List<Integer> dairy = new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

       fun(root,dairy,targetSum,ans);

       return ans;
    }
}
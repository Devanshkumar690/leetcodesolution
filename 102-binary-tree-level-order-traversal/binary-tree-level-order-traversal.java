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

    public void fun(TreeNode root , Queue<TreeNode> q ,List<List<Integer>> res ){

        if(root == null){
            return;
        } 

        q.offer(root);

        while(!q.isEmpty())
        {
            int lvlsize = q.size();

            List<Integer> tmp = new ArrayList<>();

            while(lvlsize != 0)
            {
                TreeNode t = q.poll();
                tmp.add(t.val);
                
                if(t .left != null){
                    q.offer(t.left);
                }
                if(t.right != null){
                    q.offer(t.right);
                }
                
                lvlsize--;
            }

            res.add(tmp);

        }




    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();

      

        List<List<Integer>> res = new ArrayList<>();

        fun(root,q,res);

        return res;





    }
}
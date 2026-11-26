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

    HashMap<Integer,Integer> in = new HashMap<>();

    int idxPost ;

    public TreeNode fun(int[] postorder, int[] inorder,int low,int high){

        if(low > high){
            return null;
        }

        TreeNode node = new TreeNode(postorder[idxPost]);

        idxPost--;

        int id = in.get(node.val);

        node.right = fun(postorder,inorder,id+1,high);
        node.left = fun(postorder,inorder,low,id-1);
        

        return node;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        in = new HashMap<>();
        idxPost = postorder.length-1;

        for(int i=0;i<inorder.length;i++){
            in.put(inorder[i], i);
        }

        return fun(postorder,inorder,0,inorder.length-1);
    }
}
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

    int idxPre = 0;

    public TreeNode fun(int[] preorder, int[] inorder,int low,int high){

        if(low > high){
            return null;
        }

        TreeNode node = new TreeNode(preorder[idxPre]);

        idxPre++;

        int id = in.get(node.val);

        node.left = fun(preorder,inorder,low,id-1);
        node.right = fun(preorder,inorder,id+1,high);

        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        in = new HashMap<>();
        idxPre = 0;

        for(int i=0;i<inorder.length;i++){
            in.put(inorder[i], i);
        }

        return fun(preorder,inorder,0,inorder.length-1);
    }
}
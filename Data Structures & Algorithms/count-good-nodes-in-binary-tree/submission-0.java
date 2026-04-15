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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    public int dfs(TreeNode root, int maxval){
        if(root==null) return 0;

        int res=(root.val>=maxval) ? 1:0;
        maxval=Math.max(root.val, maxval);
        res=res+dfs(root.left, maxval);
        res=res+dfs(root.right, maxval);

        return res;
    }
}

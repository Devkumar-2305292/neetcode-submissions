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
    public TreeNode invertTree(TreeNode root) {
        // TreeNode temp=root;

        // invert(temp);

        // return root;

        if(root==null) return null;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode node=q.poll();
            TreeNode left=node.left;
            node.left=node.right;
            node.right=left;

            if(node.left!=null){
                q.offer(node.left);
            }

            if(node.right!=null){
                q.offer(node.right);
            }
        }

        return root;
    }

    // public void invert(TreeNode temp){
    //     if(temp==null){
    //         return;
    //     }

        
    //     TreeNode left=temp.left;
    //     temp.left=temp.right;
    //     temp.right=left;
        
    //     invert(temp.left);
    //     invert(temp.right);
    // }
}

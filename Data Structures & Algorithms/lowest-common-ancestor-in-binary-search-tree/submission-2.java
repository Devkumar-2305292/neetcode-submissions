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
    // public void bstSearch(TreeNode root, TreeNode x, List<TreeNode> list){
    //     if(root==null) return;

    //     if(root.val==x.val){
    //         list.add(root);
    //         return;
    //     }

    //     if(root.val<x.val){
    //         list.add(root);
    //         bstSearch(root.right, x, list);
    //     }else{
    //         list.add(root);
    //         bstSearch(root.left, x, list);
    //     }
    // }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if(root==null) return null;
        // if(p==null || q==null) return null;

        // List<TreeNode> list1=new ArrayList<>();
        // List<TreeNode> list2=new ArrayList<>();

        // bstSearch(root, p, list1);//5,3
        // bstSearch(root, q, list2);//5,3,4

        // TreeNode result=new TreeNode();
        // for(int i=list1.size()-1;i>=0;i--){
        //     for(int j=list2.size()-1;j>=0;j--){
        //         if(list1.get(i)==list2.get(j)){
        //             result=list1.get(i);
        //             return result;
        //         }
        //     }
        // }

        // return null;

        while(root!=null){

            if(root.val>p.val && root.val>q.val){
                root=root.left;
            }else if(root.val<p.val && root.val<q.val){
                root=root.right;
            }else{
                return root;
            }
        }

        return null;
    }
}

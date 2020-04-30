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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return trav(root,arr,0);
    }
    public boolean trav(TreeNode root,int[] arr,int ind){
        if(root==null) return (arr.length==0);
        if(ind == arr.length-1 && root.val == arr[ind] && root.left == null && root.right == null){
            return true;
        }
        return (ind<arr.length && root.val==arr[ind] && (trav(root.left,arr,ind+1)||trav(root.right,arr,ind+1)));
    }
}

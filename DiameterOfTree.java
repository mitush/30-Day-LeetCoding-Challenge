/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int maxD = Integer.MIN_VALUE;
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        height(root);
        return maxD-1;
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        int l = height(root.left);
        int r = height(root.right);
        maxD = Math.max(maxD,l+r+1);
        return 1 + Math.max(l,r);
    }
}

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
    int ans =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null)return 0;
        trav(root);
        return ans;
    }
    public int trav(TreeNode root){
        if(root==null)return 0;
        int left = trav(root.left);
        int right = trav(root.right);
        int l = left+root.val;
        int r = right+root.val;
        int max = root.val;
        if (left < 0) {
            ans = Math.max(ans, Math.max(root.val, r));
        } else if (right < 0) {
            ans = Math.max(ans, Math.max(root.val, l));
        } else {
            ans = Math.max(ans, left+root.val+right);
        }
        return Math.max(root.val,Math.max(r,l));                         
    }
}

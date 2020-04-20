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
    int ind=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder==null || preorder.length==0)return null;
        return createTree(preorder,Integer.MAX_VALUE);
    }
    public TreeNode createTree(int[] preorder,int val){
        if(ind==preorder.length || preorder[ind]>val)return null;
        TreeNode root = new TreeNode(preorder[ind]);
        ind++;
        root.left = createTree(preorder,root.val);
        root.right = createTree(preorder,val);
        return root;
    }
}

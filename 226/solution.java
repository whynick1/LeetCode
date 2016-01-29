/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        if (root != null)
        {
            temp = invertTree(root.left);
            root.left = invertTree(root.right);
            root.right = temp;
        }
        return root;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//fail to solve this problem
//magic!
//not very complex, but hard to think of that recursive comparation
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return isSymSubTree(root.left, root.right);
    }

    public boolean isSymSubTree(TreeNode left, TreeNode right){
        if(left==null)
            return (right==null);
        if(right==null)
            return false;
        //here is the key!
        return (left.val==right.val) && isSymSubTree(left.left,right.right) && isSymSubTree(left.right,right.left);
    }
}
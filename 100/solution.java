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
    public boolean isSameTree(TreeNode p, TreeNode q) { //the sequence of statement1 and 2 could not be switch!!
        if ( p == null && q == null ) //statement1
            return true;
        if ( p == null || q == null ) //statement2
            return false;
        if ( p.val != q.val )
                return false;
        return ( isSameTree( p.left, q.left ) && isSameTree( p.right, q.right) );
        
    }
}
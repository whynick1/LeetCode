/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//good job!
//using in-order traversal
//but using TreeNode return Type could be better, because judge false by null node can save time and stack space.
public class Solution {
    int count = 1;
    int returnVal = 0;
    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return -1;
        recurKth(root, k);
        return returnVal;
    }
    public boolean recurKth(TreeNode root, int k)
    {
        if (root == null)
            return false;
        if (recurKth(root.left, k))
            return true;
        if (count++ == k)
        {
            returnVal = root.val;
            return true;
        }
        if (recurKth(root.right, k))
            return true;
        return false;
    }
}


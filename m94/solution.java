//good job! easy
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new LinkedList<>();
        inorderRecurTra(root, lst);
        return lst;
    }
    
    public void inorderRecurTra(TreeNode root, List lst)
    {
        if (root == null)
            return;
        if (root.left != null)
            inorderRecurTra(root.left, lst);
        lst.add(root.val);
        if (root.right != null)
            inorderRecurTra(root.right, lst);
    }
}
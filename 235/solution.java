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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode currentNode = root;
        while(true)
        {
            if (p.val < currentNode.val && q.val < currentNode.val)
            {
                currentNode = currentNode.left;
            }
            else if (p.val > currentNode.val && q.val > currentNode.val)
            {
                currentNode = currentNode.right;
            }
            else
                return currentNode;
        }
    }
}

//use recurrsion here can omit one statement:currentNode = currentNode.right; therefore more efficient
/*public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);

        return root;
    }
}*/
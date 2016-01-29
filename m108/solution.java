/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
//exceed memory limit, think too complex, it is not requiring an AVL tree, but a simple BST
//therefore, use binary search to Divid-and-conquer
//one more thing, always use: int middle = start + (end-start)/2;
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length ==0){
            return null;
        }
        return getTreeNode(nums, 0, nums.length-1);
    }

    private TreeNode getTreeNode(int[] nums, int start, int end){
        if (start > end){
            return null;
        }
        int middle = start + (end-start)/2;
        TreeNode n = new TreeNode(nums[middle]);
        n.left = getTreeNode(nums, start, middle-1);
        n.right = getTreeNode(nums, middle+1, end);
        return n;
    }
}
// public class Solution {
//     final int MAXBALANCE = 1;
//     public TreeNode sortedArrayToBST(int[] nums) {
//         if (nums == null || nums.length == 0)
//             return null;
//         TreeNode root = new TreeNode(nums[0]);
//         for (int i = 1; i < nums.length; i++)
//         {
//             root = insert(nums[i], root);
//         }
//         return root;
//     }
    
//     public TreeNode insert(int val, TreeNode root)
//     {
//         if (root.right != null)
//             root.right = insert(val, root.right);
//         else
//             root.right = new TreeNode(val);
//         return balanced(root);
//     }
    
//     public TreeNode balanced(TreeNode root)
//     {
//         //not balance
//         if (Math.abs(height(root.left) - height(root.right)) > MAXBALANCE)
//             root = rightRotate(root);
//         return root;
//     }
    
//     public int height(TreeNode root)
//     {
//         if (root == null)
//             return -1;
//         else
//           return Math.max(height(root.left), height(root.right)) + 1;
//     }
    
//     public TreeNode rightRotate(TreeNode root)
//     {
//         TreeNode newRoot = root.right;
//         root.right.left = root;
//         return root = newRoot;
//     }
// }


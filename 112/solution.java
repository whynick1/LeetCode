/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//Using recursion in tree problem is way faster than level traversal
public class Solution { 
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        } else {
            if (root.left == null && root.right == null) {
                return sum == root.val;
            } else {
                int subSum = sum - root.val;
                return hasPathSum(root.left, subSum) || hasPathSum(root.right, subSum);
            }
        }
    }
}

// accepted but spend much longer time than using recursion.
// public class Solution {
//     public boolean hasPathSum(TreeNode root, int sum) {
//         LinkedList<TreeNode> lst = new LinkedList<>();
//         if (root == null)
//             return false;
//         lst.offer(root);
//         while (lst.size() != 0)
//         {
//             TreeNode tn = lst.poll();
//             System.out.println("tn.val = " + tn.val);
//             if (tn.val == sum && tn.left == null && tn.right == null)
//                     return true;
//             else
//             {
//                 if (tn.left != null)
//                 {
//                     tn.left.val += tn.val;
//                     lst.offer(tn.left);
//                 }
//                 if (tn.right != null)
//                 {
//                     tn.right.val += tn.val;
//                     lst.offer(tn.right);               
//                 }
//             }
//         }
//         return false;
//     }
// }
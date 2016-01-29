/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//This is recursive solution, which I cannot figure out
//As is shown before, "recursion" is usually faster than BFS in tree traversal
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left==null && root.right==null) return 1;
        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left),minDepth(root.right));
    }
}

// //good job!
// //My non-recursive solution
// public class Solution {
//     public int minDepth(TreeNode root) {
//         LinkedList<TreeNode> lst = new LinkedList<>();
//         int countDepth = 0;
//         if (root == null)
//             return countDepth;
//         lst.add(root);
//         while (lst.size() != 0)
//         {
//             countDepth++;
//             int size = lst.size();
//             for (int i = 0; i < size; i++)
//             {
//                 TreeNode tn = lst.poll();
//                 if (tn.left == null && tn.right == null)
//                     return countDepth;
//                 if (tn.left != null)
//                     lst.add(tn.left);
//                 if (tn.right != null)
//                     lst.add(tn.right);
//             }
//         }
//         return countDepth;
//     }
// }

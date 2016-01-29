/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.lang.*;

public class Solution {
    public int maxDepth(TreeNode root) {
        if ( root == null ) //root == null is needed, o/w there is no null.left/right; same for null don't have node.next
        {
            return 0;
        }
        else
        {
            return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
        }
    }
}

// Here is the iteration version!
// public class Solution {
//     public int maxDepth(TreeNode root) {
//         if (root == null)
//             return 0;
    
//         Queue<TreeNode> queue = new LinkedList<TreeNode>();
    
//         queue.add(root);
//         int count = 0;
    
//         while (!queue.isEmpty()) {
//             int size = queue.size();     //mention: size will will be 1 and 2, and 4...
                                            //anytime there is one more level, count++
//             while (size-- > 0) {
//                 TreeNode cur = queue.remove();
//                 if (cur.left != null)
//                     queue.add(cur.left);
//                 if (cur.right != null)
//                     queue.add(cur.right);
//             }
//             count++;
//         }
//         return count;
//     }
// }public class Solution {
    public int maxProduct(String[] words) {
        int[] mask = new int[words.length];
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words[i].length(); j++) {
                mask[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
        int max = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if((mask[i] & mask[j]) == 0) {
                    max = Math.max(words[i].length() * words[j].length(), max);
                }
            }
        }
        return max;
    }
}


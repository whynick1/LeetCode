/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
//good job!
//solve with BFS, but there is a special faster recursive solution
//which can not be copy in other BFS problems
//but it has one problem actually that the stack used by recursion is O(lgN) -> must understand the stack of recursion!!
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null){
            return;
        }
    
        if (root.left != null){
            root.left.next = root.right;
            if (root.next != null){
                root.right.next = root.next.left;
            }
        }
        connect(root.left);
        connect(root.right);
    }
}

// public class Solution {
//     public void connect(TreeLinkNode root) {
//         if (root == null)
//             return;
//         Queue<TreeLinkNode> q = new LinkedList<>();
//         q.add(root);
//         while (!q.isEmpty())
//         {
//             int size = q.size();
//             TreeLinkNode lastNode = q.remove();
//             for (int i = 0; i < size; i++)
//             {
//                 if (lastNode.left != null)
//                 {
//                     q.add(lastNode.left);
//                     q.add(lastNode.right);
//                 }
//                 if (i == size - 1)
//                     lastNode.next = null;
//                 else
//                 {
//                     lastNode.next = q.remove();
//                     lastNode = lastNode.next;
//                 }
//             }
//         }
//     }
// }
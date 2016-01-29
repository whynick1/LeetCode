/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//good job by using recurrsion!
//meet two difficulties during solving the problem
//1. try to use return List<String> in recursion to path string level by level, which is complex
//   better way is to add a parameter String str to path current value;
//2. try to use bottom to top order to build string, which lead to reversed answer
//   keep in mind always be able to use the best order in recursion, save a lot of time
public class Solution {
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return list;
        findPath(root,"");
        return list;
    }
    private void findPath(TreeNode root, String str)
    {
        str = (str + root.val);
        if (root.left == null && root.right == null)
        {
            list.add(str);
        }
        str = str + "->";
        if (root.left != null)
            findPath(root.left, str);
        if (root.right != null)
            findPath(root.right, str);
    }
}


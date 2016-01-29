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
//just one thing: Using Linklist<> is absolutely faster than Queue;
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        //Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> returnList = new LinkedList<List<Integer>>();
        if (root == null)
        	return returnList;
        q.add(root);
        while (q.size() != 0)
        {
        	int size = q.size();
        	List<Integer> lst = new LinkedList<>();
        	while (size > 0)
        	{
        		TreeNode tempNode = q.poll();
        		lst.add(tempNode.val);
        		
        		if (tempNode.left != null)
        			q.add(tempNode.left);
        		if (tempNode.right != null)
        			q.add(tempNode.right);
        		size--;
        	}
        	returnList.add(lst);
        }
        return returnList;
    }
}

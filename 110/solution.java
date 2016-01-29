import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
//At first I give the wrong alg, because ignore the conditions like {1,2,2,3,3,null,null,4,4}
//If possible, we can apply dynamic programing by adding a "int height in class TreeNode", therefore,
//we can record the height of trees searched before, and don't have to search again
public class Solution {
    public boolean isBalanced(TreeNode root) {
    	
    	if (root == null)
    		return true;
    	
    	if (Math.abs(height(root.left) - height(root.right)) > 1)
    		return false;
    	else
    	{
    	    //due to the recurrsion, just like fabnacci alg, height of a node will 
    	    //be calculate more than once, which decrease alg efficiency
    		return (isBalanced(root.left) && isBalanced(root.right));
    	}
    }

    public int height(TreeNode root)
    {
    	int nodeHeight;
    	if (root == null)
    		return nodeHeight = 0;
    	else 
    	{
    		return nodeHeight = Math.max(height(root.left), height(root.right)) + 1;
    	}
    }
}
















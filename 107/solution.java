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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();//List and Queue are Interface, can be instantiated by class like
                                               //LinkList or Arraylist;
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(root==null) return returnList;//alsways consider the null input!
        //if root == null, there is no root.left/right, thus cause NoPointerException!
        q.add(root);
        while(q.size()>0){
            List<Integer> list = new ArrayList<>();
            int size = q.size();//necessary, because
            //directly using i < q.size() will cause mistake, since q.size()changed within for loop!!
            //Bottleneck: Using size to realize output lists on each level is genious! 
            for(int i=0; i<size; i++){ 
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left!=null) q.add(node.left);//the key of levelTraversal is using Queue!
                if(node.right!=null) q.add(node.right);
            }
            returnList.add(0,list);
        }
        return returnList;
    }
}

/*public void levelTraversal(TreeNode root)
{
    Queue q = q.add(root)
    While(q != null)
    {
        node = q.remove();
        //process node
        if (node.left != null)
            q.add(node.left);
        if (node.right != null)
            q.add(node.right);
    }
}*/
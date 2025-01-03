/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    List<Integer> res1 = new ArrayList<>();
    List<Integer> res2 = new ArrayList<>();

    res1=trav(p);
    res2=trav(q);
    if(res1.equals(res2))
    {
        return true;
    }
    return false;

        
    }
    public List<Integer> trav(TreeNode node )
    {
            List<Integer> res = new ArrayList<>();

        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=node;
        while(curr!=null || !(st.isEmpty()))
        {
            while(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;


    }
}
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> in=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return in;
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> res=new ArrayList<>();
            int count=q.size();
            while(count!=0)
            {
            TreeNode temp=q.poll();
            res.add(temp.val);
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null) q.offer(temp.right);
            count--;
            }
            in.add(res);
        }
        return in;
        
    }
}
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
    int sum;
    public int pathSum(TreeNode root,int rs)
    {
        if(root==null) return 0;
       
        if(root.left==null && root.right==null)
        {
            sum=sum+rs*10+root.val;
        }
        if(root.left!=null) pathSum(root.left,rs*10+root.val);
        if(root.right!=null) pathSum(root.right,rs*10+root.val);
        return 0;
        

    }
    public int sumNumbers(TreeNode root) {
        pathSum(root,0);
        return sum;
        
        
    }
}
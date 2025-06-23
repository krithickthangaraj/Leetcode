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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> in=new ArrayList<>();
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        if(root==null) return in;

        
        s1.push(root);

        while(!s1.isEmpty()){
            TreeNode curr=s1.pop();
            s2.push(curr);

            if(curr.left!=null) s1.push(curr.left);
            if(curr.right!=null) s1.push(curr.right);

        }
        while(!s2.isEmpty()){
            in.add(s2.pop().val);
        }
        return in;
    }
}
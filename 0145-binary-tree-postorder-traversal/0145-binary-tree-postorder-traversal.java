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
        ArrayList<Integer> in= new ArrayList<>();
        preorder(root,in);
        return in;
    }
    public void preorder(TreeNode root,ArrayList<Integer> in){
        TreeNode node=root;
        if(node==null) return;
        preorder(node.left,in);
        preorder(node.right,in);
        in.add(node.val);

    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      inorder(root,res);
      return res;    
    }
    public void inorder(TreeNode Node,List<Integer> res)
    {
        if(Node==null)
        {
            return; 
        }
        inorder(Node.left,res);
        res.add(Node.val);
        inorder(Node.right,res);
    }
}
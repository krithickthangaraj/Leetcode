/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode,TreeNode> map=new HashMap<>();
    private void map(TreeNode root){
        if(root==null) return;

        if(root.left!=null){
            map.put(root.left,root);
            map(root.left);
        }
        if(root.right!=null){
            map.put(root.right,root);
            map(root.right);
        }
    }
    public List<Integer> dfs(TreeNode target, int k, List<Integer> res) {
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> set=new HashSet<>();
        q.offer(target);
        set.add(target);
         
        while(!q.isEmpty()){
            int size=q.size();
            if(k==0) break;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null && !set.contains(curr.left)){
                    q.offer(curr.left);
                    set.add(curr.left);
                }
                if(curr.right!=null && !set.contains(curr.right)){
                    q.offer(curr.right);
                    set.add(curr.right);
                }
                if(map.containsKey(curr) && !set.contains(map.get(curr))){
                    q.offer(map.get(curr));
                    set.add(map.get(curr));
                }
            }
            k--;
        }
        while(!q.isEmpty()){
            res.add(q.poll().val);
        }
        return res;
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res=new ArrayList<>();

        map(root);
        dfs(target,k,res);
        return res;
    }
}
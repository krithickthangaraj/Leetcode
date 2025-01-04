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

import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) return in;
        q.offer(root);

        while (!q.isEmpty()) {
            int count = q.size(); 

            for (int i = 0; i < count; i++) {
                TreeNode temp = q.poll();

                if (i == count - 1) {
                    in.add(temp.val);
                }

                if (temp.left != null) q.offer(temp.left);
                if (temp.right != null) q.offer(temp.right);
            }
        }

        return in;
    }
}

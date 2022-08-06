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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        while(root!=null){
             List<Integer> level = new ArrayList<Integer>();
             root = lastLevel(root,level);
            ans.add(level);
        }
        return ans;
    }
   
    public TreeNode lastLevel(TreeNode root,List<Integer> level){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            level.add(root.val);
            return null;
        }
        root.left = lastLevel(root.left,level);
        root.right = lastLevel(root.right,level);
        return root;
    }
}
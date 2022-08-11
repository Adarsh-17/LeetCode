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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        while(curr!=null){
            TreeNode leftNode = curr.left;
            if(leftNode==null){
                ans.add(curr.val);
                curr = curr.right;
            } 
            else
            {
                TreeNode rightMostNode = getRightMostNode(leftNode,curr);
                if(rightMostNode.right!=null){
                     rightMostNode.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
                else {
                    rightMostNode.right = curr;
                    curr = curr.left;
                }
                    
            }
        }
        return ans;
    }
    
    public TreeNode getRightMostNode(TreeNode leftNode,TreeNode curr){
        while(leftNode.right!=null && leftNode.right!=curr){
            leftNode = leftNode.right;
        }
        return leftNode;
    }
}
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
    public boolean isCompleteTree(TreeNode root) {
        boolean end = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
         while(q.size()>0){
            TreeNode currentNode = q.remove();
             if(currentNode==null){
                 end = true;
             } else {
                 if(end){
                     return false;
                 } else {
                     q.add(currentNode.left);
                     q.add(currentNode.right);  
                 }
             }
            
         }
        return true; 
}
}
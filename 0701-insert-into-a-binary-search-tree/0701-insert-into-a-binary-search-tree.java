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
    public TreeNode insert(TreeNode root, int val){
        if(root.left==null && root.right==null){
            return root;
        }
        if(root.val>val){
            if(root.left==null){
                return root;
            }else{
                return insert(root.left, val);
            }
        }else{
            if(root.right==null){
                return root;
            }else{
                return insert(root.right, val);
            }
        }
        
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if(root==null){
            root = node;
            return root;
        }
        TreeNode place = insert(root, val);
        if(place.val>val){
            place.left = node;
        }else{
            place.right = node;
        }
        return root;
    }
}
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
    public boolean findSum(TreeNode root, int target, int sum){
        sum += root.val;
        if(root.left==null && root.right==null){
            if(sum==target){
                return true;
            }else{
                return false;
            }
        }
        if(root.left!=null && root.right!=null){
            return findSum(root.left, target, sum) || findSum(root.right, target, sum);
        }
        if(root.left==null){
            return findSum(root.right, target, sum);
        }else{
            return findSum(root.left, target, sum);
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return findSum(root, targetSum, 0);
    }
}
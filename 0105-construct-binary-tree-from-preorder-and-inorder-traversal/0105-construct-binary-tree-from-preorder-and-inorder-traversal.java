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
    public TreeNode build(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd, HashMap<Integer, Integer> hs){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = hs.get(root.val);
        int numsLeft = inRoot-inStart;
        root.left = build(preorder, inorder, preStart+1, preStart+numsLeft, inStart, inRoot-1, hs);
        root.right = build(preorder, inorder, preStart+numsLeft+1, preEnd, inRoot+1, inEnd, hs);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            hs.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1, hs);
    }
}
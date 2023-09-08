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
class BSTIterator {
    
    static Stack<TreeNode> stack;
    public void insert(TreeNode root){
        if(root==null){
            return;
        }
        stack.push(root);
        insert(root.left);
    }
    public BSTIterator(TreeNode root) {
        stack = new Stack();
        insert(root);
    }
    
    public int next() {
        TreeNode curr = stack.pop();
        if(curr.right!=null){
            insert(curr.right);
        }
        return curr.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
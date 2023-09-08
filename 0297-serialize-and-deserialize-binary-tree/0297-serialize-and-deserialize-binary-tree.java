/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        StringBuilder s = new StringBuilder();
        while(!qu.isEmpty()){
            int size = qu.size();
            for(int i=0; i<size; i++){
                TreeNode curr = qu.remove();
                if(curr==null){
                    s.append("n ");
                    continue;
                }
                s.append(curr.val+" ");
                qu.add(curr.left);
                qu.add(curr.right);
            }
        }
        return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==""){
            return null;
        }
        Queue<TreeNode> qu = new LinkedList<>();
        String[] s = data.split(" ");
        
        TreeNode root = new TreeNode(Integer.parseInt(s[0]));
        qu.add(root);
        
        for(int i=1; i<s.length; i++){
            TreeNode parent = qu.remove();
            if(!s[i].equals("n")){
                TreeNode left = new TreeNode(Integer.parseInt(s[i]));
                parent.left = left;
                qu.add(left);
            }
            if(!s[++i].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt(s[i]));
                parent.right = right;
                qu.add(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
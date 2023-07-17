/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 public int getValue(){
 return val;
 }
 * }
 */

class Solution {
    public void findAncestor(TreeNode root, TreeNode k, List<TreeNode> list){
        if(root==null){
            return;
        }
        if(root.val<k.val){
            list.add(root);
            findAncestor(root.right, k, list);
        }
        if(root.val>k.val){
            list.add(root);
            findAncestor(root.left, k, list);
        }
        if(root.val==k.val){
            list.add(root);
        }
        return;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        findAncestor(root, p, list1);
        findAncestor(root, q, list2);
        int k=0;
        while(k<list1.size()){
            System.out.print(list1.get(k).val+" ");
            k++;
        }
        k=0;
        System.out.println();
        while(k<list2.size()){
            System.out.print(list2.get(k).val+" ");
            k++;
        }
        // System.out.println();
        // System.out.println(list1.size());
        // System.out.println(list2.size());
        // Collections.sort(list1, Comparator.comparingInt(TreeNode -> TreeNode.val));
        // Collections.sort(list2, Comparator.comparingInt(TreeNode -> TreeNode.val));
        // if(list1.size()>list2.size()){
        //     return list1.get(list1.size()-2);
        // }
        // if(list1.size()<list2.size()){
        //     return list2.get(list2.size()-2);
        // }
        if(list1.size()<2){
            return list1.get(0);
        }
        if(list2.size()<2){
            return list2.get(0);
        }
        int i=1, j=1;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i).val!=list2.get(j).val){
                // System.out.println("100");
                return list1.get(i-1);
            }
            i++;
            j++;
            if(i==list1.size()){
                if(list1.get(i-1).val==list2.get(j-1).val){
                    return list1.get(i-1);
                }
            }
            if(j==list2.size()){
               if(list1.get(i-1).val==list2.get(j-1).val){
                    return list1.get(i-1);
                }
            }
        }
        
        return null;
    }
}
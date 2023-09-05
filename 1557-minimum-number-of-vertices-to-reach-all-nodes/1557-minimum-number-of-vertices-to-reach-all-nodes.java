class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res = new LinkedList<>();
        
        HashSet<Integer> hs = new HashSet<>();
        for(List<Integer> i : edges){
            hs.add(i.get(1));
        }
        
        for(int i=0; i<n; i++){
            if(!hs.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
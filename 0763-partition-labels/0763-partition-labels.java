class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hs.put(s.charAt(i), i);
        }
        int end = 0;
        int size = 0;
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            size++;
            end = Math.max(end, hs.get(s.charAt(i)));
            if(i==end){
                res.add(size);
                size=0;
            } 
        }
        return res;
    }
}
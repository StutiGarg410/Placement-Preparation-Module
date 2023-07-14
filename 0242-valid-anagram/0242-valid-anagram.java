class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(hs.containsKey(ch)){
                hs.put(ch, hs.get(ch)-1);
                if(hs.get(ch)==0){
                    hs.remove(ch);
                }
            }else{
                return false;
            }
        }
        return hs.isEmpty();
    }
}
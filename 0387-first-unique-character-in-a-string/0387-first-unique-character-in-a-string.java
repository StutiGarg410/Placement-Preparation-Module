class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i), hs.get(s.charAt(i))+1);
            }else{
                hs.put(s.charAt(i), 1);
            }
        }
        // Set<Character> keys = hs.keySet();
        // for(char ch:keys){
        //     System.out.println(ch + " " + hs.get(ch));
        // }
        for(int i=0; i<s.length(); i++){
            if(hs.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
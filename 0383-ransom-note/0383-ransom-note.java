class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            hs.put(ch, hs.getOrDefault(ch, 0)+1);
        }
        Set<Character> keys = hs.keySet();
        for(char ch : keys){
            System.out.println(ch+" "+hs.get(ch));
        }
        for(int i=0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(hs.containsKey(ch)){
                hs.put(ch, hs.get(ch)-1);
                if(hs.get(ch)==0){
                    hs.remove(ch);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if(pattern.length()!=strArray.length){
            return false;
        }
        HashMap<Character,String> hs = new HashMap<>();
        HashMap<String,Boolean> mp = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            Character ch = pattern.charAt(i);
            if(hs.containsKey(ch)){
                if(!hs.get(ch).equals(strArray[i])){
                    return false;
                }
            }else if(mp.containsKey(strArray[i])){
                return false;
            }
            else{
                hs.put(ch, strArray[i]);
                mp.put(strArray[i], true);
            }
        }
        return true;
    }
}
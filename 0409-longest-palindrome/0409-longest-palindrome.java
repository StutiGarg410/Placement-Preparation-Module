class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        boolean containsOdd = false;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);
        }
        for (Map.Entry<Character,Integer> map : hs.entrySet()) { 
            if(map.getValue()%2==0){
                ans+=map.getValue();
            }else if(map.getValue()%2==1){
                ans+=map.getValue()-1;
                containsOdd= true;
            }
        }
        if(containsOdd==true){
            return ans+1;
        }else{
            return ans;
        }
    }
}
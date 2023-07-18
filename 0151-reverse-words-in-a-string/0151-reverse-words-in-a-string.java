class Solution {
    public String reverseWords(String s) {
        String[] strArray = s.trim().split("\\s+");
        String res = "";
        for(int i=strArray.length-1; i>0; i--){
            res += strArray[i]+" "; 
        }
        return res+strArray[0];
    }
}
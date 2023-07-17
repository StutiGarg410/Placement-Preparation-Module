class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder("");
        int i=0, j=0;
        boolean f = true;
        while(i<word1.length() && j<word2.length()){
            if(f==true){
                str.append(word1.charAt(i));
                f = false;
                i++;
            }else{
                str.append(word2.charAt(j));
                f = true;
                j++;
            }
        }
        if(i<word1.length()){
            str.append(word1.substring(i));
        }
        if(j<word2.length()){
            str.append(word2.substring(j));
        }
        return str.toString();
    }
}
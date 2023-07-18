class Solution {
    public String reverseWords(String s) {
        String[] strArray = s.trim().split("\\s+");
        int i=0, j=strArray.length-1;
        while(i<j){
            if(strArray[i]!=" " && strArray[j]!=" "){
                String temp = strArray[i];
                strArray[i] = strArray[j];
                strArray[j] = temp;
            }
            i++;
            j--;
        }
        StringBuffer res = new StringBuffer();
        for(int k=0; k<strArray.length-1; k++){
            res.append(strArray[k]+" ");
        }
        res.append(strArray[strArray.length-1]);
        return res.toString();
    }
}
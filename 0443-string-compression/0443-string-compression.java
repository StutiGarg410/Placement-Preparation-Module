class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        int t = 0;
        int count=1;
        char[] res = new char[chars.length];
        int k = 0;
        res[0] = chars[0];
        t++;
        for(int i=0; i<chars.length-1; i++){
            if(chars[i]==chars[i+1]){
                count++;
            }
            else{
                if(count>1){
                    String s = String.valueOf(count);
                    for(int j=0; j<s.length(); j++){
                        res[++k] = s.charAt(j);
                        t++;
                    }
                }
                count = 1;
                res[++k] = chars[i+1];
                t++;
            }
        }
        if(count>1){
            String s = String.valueOf(count);
            for(int j=0; j<s.length(); j++){
            res[++k] = s.charAt(j);
                t++;
           }
        }
        for(int i=0; i<t; i++){
            chars[i] = res[i];
        }
        return t;
    }
}
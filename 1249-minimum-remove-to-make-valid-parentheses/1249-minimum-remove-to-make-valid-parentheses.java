class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        //forward -> ')'
        for(int i=0; i<ch.length; i++){
            if(ch[i] == '('){
                count++;
            }else if(ch[i]==')'){
                if(count>0){
                    count--;
                }else{
                    ch[i] = 0;
                }
            }
        }
        
        //backward-> '('
        count= 0;
        for(int i=ch.length-1; i>=0; i--){
            if(ch[i] == ')'){
                count++;
            }else if(ch[i]=='('){
                if(count>0){
                    count--;
                }else{
                    ch[i] = 0;
                }
            }
        }
        
        StringBuilder str = new StringBuilder();
        for(int i=0; i<ch.length; i++){
            if(ch[i]!=0){
                str.append(ch[i]);
            }
        }
        return str.toString();
    }
}
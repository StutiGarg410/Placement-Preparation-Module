class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u' || s.charAt(j)=='A' || s.charAt(j)=='E' || s.charAt(j)=='I' || s.charAt(j)=='O' || s.charAt(j)=='U'){
                    char a = s.charAt(i);
                    char b = s.charAt(j);
                    s = s.substring(0, i) + b + s.substring(i + 1);
                    s = s.substring(0, j) + a + s.substring(j + 1);
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else{
                if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u' || s.charAt(j)=='A' || s.charAt(j)=='E' || s.charAt(j)=='I' || s.charAt(j)=='O' || s.charAt(j)=='U'){
                    i++;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return s;
    }
}
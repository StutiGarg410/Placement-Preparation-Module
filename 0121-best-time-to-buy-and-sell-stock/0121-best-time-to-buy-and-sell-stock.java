class Solution {
    public int maxProfit(int[] prices) {
        int bp = Integer.MAX_VALUE;
        int maxP = 0;
        for(int i=0; i<prices.length; i++){
            if(bp<prices[i]){
                int p = prices[i]-bp;
                maxP = Math.max(p, maxP);
            }else{
                bp = prices[i];
            }
        }
        return maxP;
    }
}
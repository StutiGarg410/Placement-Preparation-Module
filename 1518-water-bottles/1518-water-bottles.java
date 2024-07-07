class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinkBottles = 0;
        while(numBottles>=numExchange){
            int newBottles = numBottles/numExchange;
            int remainingBottles = numBottles%numExchange;
            drinkBottles += newBottles*numExchange;
            numBottles = newBottles + remainingBottles;
        }        
        return drinkBottles+numBottles;
    }
}
class Solution {
    public static int totalWays(int n, int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        ways[n] = totalWays(n-1, ways) + totalWays(n-2, ways);
        return ways[n];
    }
    public int climbStairs(int n) {
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        return totalWays(n, ways);
    }
}
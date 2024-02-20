class Solution {
    public int missingNumber(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]<nums.length){
                visited[nums[i]]=true;
            }
        }
        int i=0;
        for(i=0; i<visited.length; i++){
            if(visited[i]!=true){
                break;
            }
        }
        return i;
    }
}
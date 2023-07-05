class Solution {
    public int longestSubarray(int[] nums) {
        int count_Zero = 0;
        int start = 0;
        int longest_Window = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count_Zero++;
            }
            while(count_Zero>1){
                if(nums[start]==0){
                    count_Zero--;
                }
                start++;
            }
            longest_Window = Math.max(longest_Window, i-start);
        }
        return longest_Window;
    }
}
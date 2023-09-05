class Solution {
    public boolean isPossible(int[] nums, int p, int diff){
        for(int i=1; i<nums.length; i++){
            if(nums[i]-nums[i-1]<=diff){
                p--;
                i++;
            }
        }
        return p<=0;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length-1]-nums[0];
        int ans = right;
        
        while(left<=right){
            int mid = (left+right)/2;
            if(isPossible(nums, p, mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}
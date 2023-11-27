class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0, max=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[min]){
                min = i;
            }
            if(nums[i]>nums[max]){
                max = i;
            }
        }
        int nums1 = Math.max(min+1, max+1);
        int nums2 = Math.max(nums.length-min, nums.length-max);
        int nums3 = Math.min(max, min)+1+Math.min(nums.length-min, nums.length-max);
        
        return Math.min(nums1, Math.min(nums2, nums3));
    }
}
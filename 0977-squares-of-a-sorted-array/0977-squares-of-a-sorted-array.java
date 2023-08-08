class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] *= nums[i];
        }
        int l = 0, r = nums.length-1;
        int[] res = new int[nums.length];
        int k = res.length-1;
        while(l<=r){
            if(nums[l]<=nums[r]){
                res[k] = nums[r];
                r--;
            }else{
                res[k] = nums[l];
                l++;
            }
            k--;
        }
        return res;
    }
}
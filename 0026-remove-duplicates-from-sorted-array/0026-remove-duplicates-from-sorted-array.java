class Solution {
    public int removeDuplicates(int[] nums) {
        int u = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[u]){
                nums[++u]= nums[i];
            }
        }
        return u+1;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hs.put(nums[i], hs.getOrDefault(nums[i], 0)+1);
        }
        for(Integer i : hs.keySet()) {
            if(hs.get(i) > nums.length/2) {
            return i;
            }
        }
        return -1;
    }
}
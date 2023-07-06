class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                arr.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int j=0;
        int[] res = new int[arr.size()];
        while(j<arr.size()){
            res[j] = arr.get(j);
            j++;
        }
        return res;
    }
}
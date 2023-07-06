class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i])+1);
            }else{
                map.put(nums1[i], 1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int j=0;
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i])){
                arr.add(nums2[i]);
                if(map.get(nums2[i])>1){
                    map.put(nums2[i], map.get(nums2[i])-1);
                }else{
                    map.remove(nums2[i]);
                }
            }
        }
        int[] res = new int[arr.size()];
        while(j<arr.size()){
            res[j] = arr.get(j);
            j++;
        }
        return res;
    }
}
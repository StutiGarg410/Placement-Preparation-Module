class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        int i=m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                //swap(nums1[i], nums1[k]);
                int temp = nums1[i];
                nums1[i] = nums1[k];
                nums1[k] = temp;
                i--;
            }
            else{
                // swap(nums2[j], nums1[k]);
                int temp = nums2[j];
                nums2[j] = nums1[k];
                nums1[k] = temp;
                j--;
            }
            k--;
        }
        while(i>=0){
            nums1[k--]=nums1[i--];
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}
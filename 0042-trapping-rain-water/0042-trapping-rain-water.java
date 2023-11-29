class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        
        int[] waterLevel = new int[height.length];
        for(int i=0; i<height.length; i++){
            waterLevel[i] = Math.min(leftMax[i], rightMax[i]);
        }
        
        int capacity = 0;
        
        for(int i=0; i<height.length; i++){
            capacity += (waterLevel[i]-height[i])*1; 
        }
        return capacity;
    }
}
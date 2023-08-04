class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int left = 0;
        int right = 1;
        while(right<intervals.length){
            if(intervals[left][1]<=intervals[right][0]){  //non-overlapping
                left = right; 
                right++;
            }
            else if(intervals[left][1]<intervals[right][1]){   //removing right interval
                count++;
                right++;
            }
            else if(intervals[left][1]>=intervals[right][1]){   //removing left interval
                count++;
                left = right; 
                right++;
            }
        }
        return count;
    }
}
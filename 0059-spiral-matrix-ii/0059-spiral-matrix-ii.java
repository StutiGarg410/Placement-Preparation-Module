class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int minrow = 0, mincol=0;
        int maxrow = n-1;
        int maxcol=n-1;
        int count=1;
        int te = n*n;
        while(count<=te){
            if(count<=te){
                for(int i=mincol; i<=maxcol; i++){
                    arr[minrow][i] = count;
                    count++;
                }
                minrow++;
                if(count<=te){
                    for(int i=minrow; i<=maxrow; i++){
                        arr[i][maxcol] = count;
                        count++;
                    }
                }
                maxcol--;
                if(count<=te){
                    for(int i=maxcol; i>=mincol; i--){
                        arr[maxrow][i] = count;
                        count++;
                    }
                }
                maxrow--;
                if(count<=te){
                    for(int i=maxrow; i>=minrow; i--){
                        arr[i][mincol]=count;
                        count++;
                    }
                }
                mincol++;
            }
        }
        return arr;
    }
}
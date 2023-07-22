class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int minrow = 0;
        int mincol = 0;
        int maxrow = matrix.length-1;
        int maxcol = matrix[0].length-1;
        int count=0;
        int te = (maxcol+1)*(maxrow+1);
        while(count<te){
            if(count<te){
                for(int i=mincol; i<=maxcol; i++){
                    list.add(matrix[minrow][i]);
                    count++;
                }
            }
            minrow++;
            if(count<te){
                for(int i=minrow; i<=maxrow; i++){
                    list.add(matrix[i][maxcol]);
                    count++;
                }
            }
            maxcol--;
            if(count<te){
                for(int i=maxcol; i>=mincol; i--){
                    list.add(matrix[maxrow][i]);
                    count++;
                }
            }
            maxrow--;
            if(count<te){
                for(int i=maxrow; i>=minrow; i--){
                    list.add(matrix[i][mincol]);
                    count++;
                }
            }
            mincol++;
        }
        return list;
    }
}
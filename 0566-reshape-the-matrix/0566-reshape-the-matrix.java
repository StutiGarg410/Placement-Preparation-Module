class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c){
            return mat;
        }
        int[][] res = new int[r][c];
        int newR = 0;
        int newC = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[newR][newC] = mat[i][j];
                newC++;
                if(newC == c){
                    newC = 0;
                    newR++;
                }
            }
        }
        return res;
    }
}
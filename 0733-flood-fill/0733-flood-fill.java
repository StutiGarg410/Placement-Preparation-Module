class Solution {
    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int originalColor){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || vis[sr][sc] || image[sr][sc]!=originalColor){
            return;
        }
        
        image[sr][sc] = color;
        
        //left
        helper(image, sr, sc-1, color, vis, originalColor);
        
        //right
        helper(image, sr, sc+1, color, vis, originalColor);
        
        //up
        helper(image, sr-1, sc, color, vis, originalColor);
        
        //down
        helper(image, sr+1, sc, color, vis, originalColor);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
}
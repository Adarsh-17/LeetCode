class Solution {
    public int[] findBall(int[][] grid) {
        int[] fallsBottom = new int[grid[0].length];
        for(int col=0;col<grid[0].length;col++){
          fallsBottom[col] = fallsAtBottom(grid,0,col);
        }
        return fallsBottom;
    }
    
    public int fallsAtBottom(int[][] grid,int row,int col){
        if(row==grid.length){
            return col;
        }
        int nextCol =  col + grid[row][col];
         if (nextCol < 0 || nextCol > grid[0].length - 1 || grid[row][col] != grid[row][nextCol])         {
            return -1;
        }
        return fallsAtBottom(grid,row+1,nextCol);
    }
}
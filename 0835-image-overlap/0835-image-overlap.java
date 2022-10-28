class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int maxCount = 0;
        for(int i=0;i<img1.length;i++){
            for(int j=0;j<img2.length;j++){
                maxCount = Math.max(maxCount,shiftAndCount(img1,img2,i,j));
                maxCount = Math.max(maxCount,shiftAndCount(img2,img1,i,j));
            }
        }
        return maxCount;
    }
    
    public int getMatchCount(int[][] A,int[][] B,int startAI,int startAJ){
        int leftcount = 0;
        int rightcount = 0;
        int startBI = 0;
        int startBJ = 0;
        for(int i=startAI;i<A.length;i++){
            startBJ = 0;
            for(int j=startAJ;j<B.length;j++){
                if(A[i][j]==1&&A[i][j]==B[startBI][startBJ]){
                    leftcount++;
                }
                if(B[i][j]==1&&B[i][j]==A[startBI][startBJ]){
                    rightcount++;
                }
                startBJ++;
            }
            startBI++;
        }
        return Math.max(rightcount,leftcount);
    }
    protected int shiftAndCount(int[][] M, int[][] R,int xShift,int yShift) {
        int leftShiftCount = 0, rightShiftCount = 0;
        int rRow = 0;
        // count the cells of ones in the overlapping zone.
        for (int mRow = yShift; mRow < M.length; ++mRow) {
            int rCol = 0;
            for (int mCol = xShift; mCol < M.length; ++mCol) {
                if (M[mRow][mCol] == 1 && M[mRow][mCol] == R[rRow][rCol])
                    leftShiftCount += 1;
                if (M[mRow][rCol] == 1 && M[mRow][rCol] == R[rRow][mCol])
                    rightShiftCount += 1;
                rCol += 1;
            }
            rRow += 1;
        }
        return Math.max(leftShiftCount, rightShiftCount);
    }
}
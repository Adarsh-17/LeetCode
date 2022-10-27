class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int maxcount = 0;
        for(int i=0;i<img1.length;i++){
            for(int j=0;j<img2.length;j++){    
               maxcount = Math.max(maxcount,countOverlap(img1,img2,i,j));
               
               maxcount = Math.max(maxcount,countOverlap(img2,img1,i,j));
            }
        }
        return maxcount;
    }
    
    
    public int countOverlap(int[][] M,int[][] R,int x,int y){
                int leftShiftCount = 0, rightShiftCount = 0;
        int rRow = 0;
        for (int mRow = y; mRow < M.length; mRow++) {
            int rCol = 0;
            for (int mCol = x; mCol < M.length; mCol++) {
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
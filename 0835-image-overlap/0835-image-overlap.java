class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int len = img1.length;
        int maxCount = 0;
        for(int yshift=0;yshift<len;yshift++){
            for(int xshift=0;xshift<len;xshift++){
                maxCount = Math.max(maxCount,shiftAndCount(img1,img2,yshift,xshift));
                maxCount = Math.max(maxCount,shiftAndCount(img2,img1,yshift,xshift));
            }
        }
        return maxCount;
    }
    
    public int shiftAndCount(int[][] A,int[][] B,int yshift,int xshift){
        int rightshiftcount = 0;
        int leftshiftcount = 0;
        int len = A.length;
        int brow = 0;
        int bcol = 0;
        for(int row=0;row+yshift<len;row++){
            for(int col=0;col+xshift<len;col++){
                if(A[row][col]==1 && A[row][col] == B[row+yshift][col+xshift]){
                    rightshiftcount++;
                }
                if(B[row+yshift][col]==1 && A[row][col+xshift] == B[row+yshift][col]){
                    leftshiftcount++;
                }
            }
        }
        System.out.println(yshift+"-"+xshift+"-"+leftshiftcount+"-"+rightshiftcount);
        return Math.max(rightshiftcount,leftshiftcount);
    }
    
}
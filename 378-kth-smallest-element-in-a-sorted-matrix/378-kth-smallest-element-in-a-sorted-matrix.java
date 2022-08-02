class Solution {
    public int kthSmallest(int[][] matrix, int k) {
      int size = matrix.length;
      int lo = matrix[0][0];
      int hi = matrix[size-1][size-1];
      while(lo<hi){
          int mid = lo + (hi-lo)/2;
          int count = lessEqual(matrix,mid);
          if(count<k){
              lo = mid + 1;
          } else {
              hi = mid;
          }
      }
      return lo;
    }
    
    public int lessEqual(int[][] matrix,int target){
        int n = matrix.length-1;
        int i = n;
        int j = 0;
        int count = 0;
        while(i>=0 && j<=n){
            if(matrix[i][j]>target){
               i--; 
            } else {
               count = count + i + 1;
               j++;
            }
        }
        return count;
    }
}
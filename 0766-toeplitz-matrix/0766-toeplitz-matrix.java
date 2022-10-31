class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix[0].length;i++){
           for(int j=0;j<matrix.length;j++){
              int start = matrix[j][i];
              int diag_x = i+1;
              int diag_y = j+1;
              while(diag_x<matrix[0].length && diag_y<matrix.length){
                if(matrix[diag_y][diag_x]!=start){
                    System.out.println(diag_y+"->"+diag_x);
                    return false;
                }
                diag_y++;
                diag_x++;
                }
           }
            
        }
        return true;
    }
}
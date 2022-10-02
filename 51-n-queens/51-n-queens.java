class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        solve(board,0,0);
        return ans;
    }
    
    public void solve(int[][] board,int row,int col){
        if(row==board.length){
           List<String> res = new ArrayList<>();
           for(int i=0;i<board.length;i++){
               StringBuilder str = new StringBuilder();
               for(int j=0;j<board.length;j++){
                   if(board[i][j]==1){
                       str.append('Q');
                   } else {
                       str.append('.');
                   }
               }
               res.add(str.toString());
           }
          ans.add(res);
            return;
        }
        
        for(int i=0;i<board.length;i++){
            if(board[row][i]==0){
                board[row][i] = 1;
                filldown(board,row,i);
                fillrightdiag(board,row,i);
                fillleftdiag(board,row,i);
                solve(board,row+1,i);
                emptydown(board,row,i);
                emptyrightdiag(board,row,i);
                emptyleftdiag(board,row,i);
                board[row][i] = 0;
            }
        }
    }
    
    public void filldown(int[][] board,int row,int col){
        for(int i=row+1;i<board.length;i++){
            board[i][col] += -1;
        }
    }
    
     public void emptydown(int[][] board,int row,int col){
        for(int i=row+1;i<board.length;i++){
            board[i][col] += 1;
        }
    }
    
     public void fillleftdiag(int[][] board,int row,int col){
        int i = row+1;
        int j = col-1;
        while(j>=0 && i<board.length){
            board[i][j] += -1;
            i++;
            j--;
        }
    }
    
     public void emptyleftdiag(int[][] board,int row,int col){
        int i = row+1;
        int j = col-1;
        while(j>=0 && i<board.length){
            board[i][j] += 1;
            i++;
            j--;
        }
    }
    
     public void fillrightdiag(int[][] board,int row,int col){
         int i = row+1;
         int j = col+1;
        while(j<board.length && i<board.length){
            board[i][j] += -1;
            i++;
            j++;
        }
    }
    
     public void emptyrightdiag(int[][] board,int row,int col){
         int i = row+1;
         int j = col+1;
        while(j<board.length && i<board.length){
            board[i][j] += 1;
            i++;
            j++;
        }
    }
}
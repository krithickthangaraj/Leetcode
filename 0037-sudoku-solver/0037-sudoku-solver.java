class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){       
                  if(board[i][j]=='.'){

                    for(char c='1';c<='9';c++){

                        if(isValid(board,i,j,c)){
                            board[i][j]=c;                         
                            if(solve(board)==true) return true;
                            else board[i][j]='.';
                        }
                        
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[row][i]==c || board[i][col]==c) return false;
        }
        int curr_row=3 *(row/3 );
        int curr_col=3* (col/3);
        for(int i=curr_row;i<curr_row+3;i++){
            for(int j=curr_col;j<curr_col+3;j++){
                  if(board[i][j]==c) return false;
            }
        }
        return true;
    }
}
public class Solution {
    public boolean isValidSudoku(char[][] board) {  
        // IMPORTANT: Please reset any member data you declared, as  
        // the same Solution instance will be reused for each test case.  
        
        //  row  
        for(int i=0; i<board.length; i++){  
            boolean[] rowCheck = new boolean[81];  
            for(int j=0; j<board[0].length; j++){  
                if(board[i][j]!='.'){  
                    if(rowCheck[board[i][j]]==true) return false;  
                    else rowCheck[board[i][j]] = true;                      
                }  
            }  
        } 
        //  col   
        for(int i=0; i<board[0].length; i++){  
            boolean[] colCheck = new boolean[81];  
            for(int j=0; j<board.length; j++){  
                if(board[j][i]!='.'){  
                    if(colCheck[board[j][i]]==true) return false;  
                    else colCheck[board[j][i]] = true;                      
                }  
            }  
        }  
          
        // rule3, sub-box  
        for(int i=0; i<3; i++){  
            for(int j=0; j<3; j++){// for each sub-box  
                 boolean[] boxCheck = new boolean[81];  
                for(int m=i*3; m<i*3+3; m++){//row  
                    for(int n=j*3; n<j*3+3; n++){//column  
                        if(board[m][n] != '.'){  
                            if(boxCheck[board[m][n]]==true) return false;  
                            else boxCheck[board[m][n]] = true;                                 
                        }  
                    }  
                }  
            }  
        }  
        return true;  
    }  
}
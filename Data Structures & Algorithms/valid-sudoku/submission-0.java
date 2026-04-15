class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;

        //Checking row :
        for(int i=0;i<n;i++){
            Set<Character> set=new HashSet<>();

            for(int j=0;j<m;j++){
                if(board[i][j]!='.' && set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }

        //Checking column :
        for(int i=0;i<n;i++){
            Set<Character> set=new HashSet<>();

            for(int j=0;j<m;j++){
                if(board[j][i]!='.' && set.contains(board[j][i])){
                    return false;
                }
                set.add(board[j][i]);
            }
        }

        //Checking sub-Matrix :
        for(int row=0;row<9;row=row+3){
            for(int col=0;col<9;col=col+3){

                Set<Character> set=new HashSet<>();

                for(int i=row;i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        if(board[i][j]!='.' && set.contains(board[i][j])){
                            return false;
                        }
                        set.add(board[i][j]);
                        
                    }
                }
            }
        }

        return true;

    }
}

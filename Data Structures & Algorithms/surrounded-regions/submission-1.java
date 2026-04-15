class Solution {
    public int[][] dirs={{1,0}, {0,1}, {-1, 0}, {0, -1}};

    public void dfs(int i, int j, char[][] board){
        if(board[i][j]=='X'){
            return;
        }

        int n=board.length;
        int m=board[0].length;
        board[i][j]='#';
        

        int dx=i, dy=j;
        for(int[] dir:dirs){
            int nx=dx+dir[0], ny=dy+dir[1];

            if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]=='O'){
                dfs(nx, ny, board);
            }
        }
    }

    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;

        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
                dfs(i, 0, board);
            }
        }

        for(int i=0;i<n;i++){
            if(board[i][m-1]=='O'){
                dfs(i, m-1, board);
            }
        }

        for(int j=0;j<m;j++){
            if(board[0][j]=='O'){
                dfs(0, j, board);
            }
        }

        for(int j=0;j<m;j++){
            if(board[n-1][j]=='O'){
                dfs(n-1, j, board);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }


    }
}

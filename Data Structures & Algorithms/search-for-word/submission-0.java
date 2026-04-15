class Solution {
    public boolean helper(int i, int j, char[][] board, String word, int n, int m, boolean[][] visited, int index){
        if(index==word.length()){
            return true;
        }

        if(i<0 || i>=n || j<0 || j>=m || board[i][j]!=word.charAt(index) || visited[i][j]){
            return false;
        }

        if(board[i][j]==word.charAt(index)){
            visited[i][j]=true;
            
        }

        

        boolean left= helper(i, j-1, board, word, n, m, visited, index+1);
        boolean right= helper(i, j+1, board, word, n, m, visited, index+1);
        boolean up= helper(i-1, j, board, word, n, m, visited, index+1);
        boolean down= helper(i+1, j, board, word, n, m, visited, index+1);

        visited[i][j]=false;

        return left || right || up || down;

    }

    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;

        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                visited[i][j]=false;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(helper(i, j, board, word, n, m, visited, 0)){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

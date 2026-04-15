class Solution {
    public void helper(char[][] grid, int n, int m, int i, int j){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]=='0'){
            return;
        }

        if(grid[i][j]=='1'){
            grid[i][j]='0';
        }

        helper(grid, n, m, i-1, j);
        helper(grid, n, m, i+1, j);
        helper(grid, n, m, i, j+1);
        helper(grid, n, m, i, j-1);
    }

    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    helper(grid, n, m, i, j);
                }
            }
        }

        return count;
    }
}

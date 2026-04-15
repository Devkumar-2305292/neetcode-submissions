class Solution {
    public void areaIsland(int i, int j, int n, int m, int[][] grid, int[] count){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==0){
            return;
        }

        if(grid[i][j]==1){
            count[0]++;
            grid[i][j]=0;
        }

        areaIsland(i-1, j, n, m, grid, count);
        areaIsland(i+1, j, n, m, grid, count);
        areaIsland(i, j+1, n, m, grid, count);
        areaIsland(i, j-1, n, m, grid, count);

    }

    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int[] count=new int[1];
                    count[0]=0;
                    
                    areaIsland(i, j, n, m, grid, count);
                    max=Math.max(max, count[0]);
                }
            }
        }

        return max;
    }
}

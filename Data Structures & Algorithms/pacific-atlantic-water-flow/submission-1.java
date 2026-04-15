class Solution {
    int[][] dirs={{1,0}, {0,1}, {-1, 0}, {0, -1}};

    public void dfs(int i, int j, boolean[][] visited, int[][] heights){
        int n=heights.length;
        int m=heights[0].length;

        visited[i][j]=true;
        int dx=i, dy=j;

        for(int[] dir:dirs){
            int nx=dx+dir[0], ny=dy+dir[1];

            if(nx>=0 && nx<n && ny>=0 && ny<m && !visited[nx][ny] && heights[nx][ny]>=heights[i][j]){
                dfs(nx, ny, visited, heights);
            }
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;

        boolean[][] pacific=new boolean[n][m];
        boolean[][] atlantic=new boolean[n][m];

        for(int i=0;i<n;i++){
            dfs(i, 0, pacific, heights);
        }

        for(int j=0;j<m;j++){
            dfs(0, j, pacific, heights);
        }

        for(int i=0;i<n;i++){
            dfs(i, m-1, atlantic, heights);
        }

        for(int j=0;j<m;j++){
            dfs(n-1, j, atlantic, heights);
        }

        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    res.add(Arrays.asList(i, j));
                }
            }
        }

        return res;
    }
}

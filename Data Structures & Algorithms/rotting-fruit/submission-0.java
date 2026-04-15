class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        int count=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    fresh++;
                }

                if(grid[i][j]==2){
                    q.offer(new int[]{i, j});
                }
            }
        }

        int[][] dirs={{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while(fresh>0 && !q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                int[] curr=q.poll();

                for(int[] dir:dirs){
                    int r=curr[0]+dir[0];
                    int c=curr[1]+dir[1];

                    if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==1){
                        grid[r][c]=2;
                        q.offer(new int[]{r, c});
                        fresh--;
                    }
                }
            }

            count++;
        }

        return fresh==0 ? count : -1;
    }
}

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        int[] indegree=new int[numCourses];
        for(int[] pre:prerequisites){
            adj.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }

        int[] ans=new int[numCourses];
        boolean[] visited=new boolean[numCourses];
        int i=0;
        while(!q.isEmpty()){
            int node=q.poll();
            visited[node]=true;
            ans[i]=node;
            i++;
            for(int nei:adj.get(node)){
                indegree[nei]--;

                if(indegree[nei]==0){
                    q.offer(nei);
                }
            }
        }

        for(int j=0;j<numCourses;j++){
            if(!visited[j] && indegree[j]==0){
                ans[i]=j;
            }
        }

        return i==numCourses ? ans:new int[]{};
    }
}

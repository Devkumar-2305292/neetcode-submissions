class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }

        int[] indegree=new int[numCourses];
        for(int[] pre:prerequisites){
            list.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }

        int[] arr=new int[numCourses];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }

        int i=0;
        while(!q.isEmpty()){
            int node=q.poll();
            arr[i]=node;
            i++;
            for(int nei:list.get(node)){
                indegree[nei]--;
                if(indegree[nei]==0){
                    q.offer(nei);
                }
            }
        }

        if(i==numCourses) return arr;
        return new int[0];
    }
}

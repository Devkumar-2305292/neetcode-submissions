class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<points.length;i++){
            int distance=points[i][0]*points[i][0] + points[i][1]*points[i][1];
            map.put(i, distance);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq=new PriorityQueue<>( (e1, e2) -> Integer.compare(e1.getValue(), e2.getValue()) );
        pq.addAll(map.entrySet());

        int[][] arr=new int[k][2];
        for(int i=0;i<k;i++){
            Map.Entry<Integer, Integer> entry=pq.poll();
            int index=entry.getKey();
            arr[i][0]=points[index][0];
            arr[i][1]=points[index][1];
        }

        return arr;
    }
}

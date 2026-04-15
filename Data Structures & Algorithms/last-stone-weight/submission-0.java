class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            maxHeap.offer(stones[i]);
        }

        while(maxHeap.size()>=2){
            int x=maxHeap.poll();
            int y=maxHeap.poll();

            if(x==y){
                continue;
            }else{
                maxHeap.offer(Math.abs(x-y));
            }
        }

        if(maxHeap.size()==1){
            return maxHeap.peek();
        }else{
            return 0;
        }
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++){
            minHeap.offer(nums[i]);
        }
        
        while(k>1){
            minHeap.poll();
            k--;
        }

        return minHeap.poll();
    }
}

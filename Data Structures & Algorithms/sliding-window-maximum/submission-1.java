class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0, r=k-1;
        ArrayList<Integer> list=new ArrayList<>();
        
        while(r<nums.length){
            HashSet<Integer> set=new HashSet<>();
            for(int i=l;i<=r;i++){
                set.add(nums[i]);
            }
            list.add(Collections.max(set));
            l++;
            r++;
        }

        int[] ans=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }

        return ans;
    }
}

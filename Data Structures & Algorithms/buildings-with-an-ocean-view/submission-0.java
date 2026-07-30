class Solution {
    public int[] findBuildings(int[] heights) {
        int n=heights.length;
        int[] suffix=new int[n];

        suffix[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(heights[i], suffix[i+1]);
        }

        //     4 3 3 2 1

        int count=1;
        for(int i=0;i<n-1;i++){
            if(suffix[i]>suffix[i+1]){
                count++;
            }
        }

        int[] ans=new int[count];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(suffix[i]>suffix[i+1]){
                ans[j++]=i;
            }
        }

        ans[j]=n-1;

        return ans;
    }
}
class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int n=heights.length;

        for(int i=0;i<n-1;i++){
            int area=0;
            for(int j=i+1;j<n;j++){
                area=Math.min(heights[i], heights[j])*(j-i);
                max=Math.max(max, area);
            }

        }

        return max;
    }
}

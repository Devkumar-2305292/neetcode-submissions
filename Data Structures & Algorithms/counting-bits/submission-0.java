class Solution {
    public int[] countBits(int n) {
        int[] nums=new int[n+1];

        for(int i=0;i<=n;i++){
            String sb=Integer.toBinaryString(i);
            int count=0;

            int j=0;
            while(j<sb.length()){
                if(sb.charAt(j)=='1'){
                    count++;
                }
                j++;
            }

            nums[i]=count;
        }

        return nums;
    }
}

class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        int count=0;

        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='1'){
                count++;
            }
            i++;
        }

        return count;
    }
}

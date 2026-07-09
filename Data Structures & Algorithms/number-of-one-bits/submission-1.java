class Solution {
    public int hammingWeight(int n) {
        // String s=Integer.toBinaryString(n);
        // int count=0;

        // int i=0;
        // while(i<s.length()){
        //     if(s.charAt(i)=='1'){
        //         count++;
        //     }
        //     i++;
        // }

        // return count;

        //Method-2
        if(n==0) return 0;

        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.insert(0, n%2);
            n=n/2;
        }

        int count=0;
        int i=0;
        while(i<sb.length()){
            if(sb.charAt(i)=='1'){
                count++;
            }
            i++;
        }

        return count;
    }
}

class Solution {
    public boolean isPalin(int start, int end, String s){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public int countSubstrings(String s) {
        int n=s.length();
        if(n==1){
            return 1;
        }

        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalin(i, j, s)){
                    count++;
                }
            }
        }

        return count;
    }
}

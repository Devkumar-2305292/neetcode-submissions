class Solution {
    public void reverse(char[] arr){
        int i=0, j=arr.length-1;

        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public String maximumOddBinaryNumber(String s) {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        reverse(arr);

        int i=arr.length-1;
        while(i>=0 && arr[i]=='0'){
            i--;
        }

        char temp=arr[i];
        arr[i]=arr[arr.length-1];
        arr[arr.length-1]=temp;

        return new String(arr);

        
    }
}
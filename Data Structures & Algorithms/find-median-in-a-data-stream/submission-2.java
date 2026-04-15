class MedianFinder {
    private ArrayList<Integer> arr;

    public MedianFinder() {
        this.arr=new ArrayList<>();
    }
    
    public void addNum(int num) {
        arr.add(num);
    }
    
    public double findMedian() {
        int n=arr.size();
        arr.sort(null);
        if(n%2==0){
            int sum=arr.get((n-1)/2)+arr.get(n/2);
            double median=(double)sum/2;
            return median;
        }else{
            return (double)arr.get(n/2);
        }
    }
}

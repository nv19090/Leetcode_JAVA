class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum=0;
        int i=(5*arr.length)/100;
        int p=i;
        int n=arr.length-i;
        int to_divide=arr.length-(i*2);
        while(p<n){
            sum+=arr[p];
            p++;
        }
        return sum/to_divide;
    }
}

class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int sum=0;
        int mx=0;
        for(int i=1;i<n+1;i++){
            sum+=gain[i-1];
            mx=Math.max(mx,sum);
        }
        return mx;
    }
}

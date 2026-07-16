class Solution {
    public long gcdSum(int[] nums) {
        int mx=Integer.MIN_VALUE;
        int n=nums.length;
        int[] prefixGcd=new int[n];
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            prefixGcd[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prefixGcd);
        int p=0;
        int q=n-1;
        long ans=0;
        while(p<q){
            ans+=gcd(prefixGcd[p],prefixGcd[q]);
            p++;
            q--;
        }
        return ans;
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

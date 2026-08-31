class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mn=Math.min(mn,nums[i]);mx=Math.max(mx,nums[i]);
        }
        int mnidx=-1;
        int mxidx=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==mx)    mxidx=i;
            else if(nums[i]==mn)    mnidx=i;
        }
        int ans=Integer.MAX_VALUE;
        int left =Math.max(mxidx,mnidx)+1;
        int right=n-Math.min(mxidx,mnidx);
        int both= Math.min(mxidx,mnidx)+1+n-Math.max(mxidx,mnidx);
        return Math.min(left, Math.min(right, both));
    }
}

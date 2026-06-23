class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int lower=nums[i];
            int sum=0;
        while(lower!=0){
            int p=lower%10;
            sum+=p;
            lower=lower/10;
        }
        ans=Math.min(ans,sum);
        
        }
       
        return ans;
    }
}

class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mn=Math.min(mn,nums[i]);
            mx=Math.max(mx,nums[i]);
        }
        int [] ans=new int[n];
        int j=0;
        while(j<n){
            for(int i=mn;i<=mx;i++){
                if(mp.containsKey(i)){
                    if(mp.get(i)>0){
                        ans[j]=i;
                        mp.put(i,mp.get(i)-1);
                        j++;
                    }
                }
            }
        }
        return ans;
    }
}

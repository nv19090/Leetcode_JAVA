class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int n = nums.length;
        int mx=0;
        int i = 0;
        while(i<n){
            if(nums[i]!=0){
                count=count+1;
                mx=Math.max(mx,count);
            }
            else count=0;
            i++;
        }
        return mx;
    }
}

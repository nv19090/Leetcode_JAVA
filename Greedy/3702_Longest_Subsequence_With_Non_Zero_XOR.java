class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int ans = 0;
        int count = 0;
        int sum = 0;
        for (int k = 0; k < n; k++) {
            xor ^= nums[k];
            sum += nums[k];
            count++;
        }
        int num=n;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                num--;
            }
        }
        if(num==0) return 0;
        if (xor != 0)
            return count;
        else {
            for (int i = 0; i < n; i++) {
                xor ^= nums[i];
                if (xor != 0) {
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}

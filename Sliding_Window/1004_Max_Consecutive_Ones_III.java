class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int p = k;
        int ans = Integer.MIN_VALUE;
        while (i < n && j < n) {
            if (nums[j] == 1) {
                j++;
            }
            while (j < n && nums[j] == 0 && p >= 0) {
                j++;
                p--;
            }
            if (p < 0) {
                if (nums[i] == 0) {
                    p++;
                    i++;
                } else {
                    i++;
                }
            }
            ans = Math.max(ans, j - i);
        }
        return ans;
    }
}

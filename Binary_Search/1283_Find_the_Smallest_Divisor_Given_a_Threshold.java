class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;

        int highest = Integer.MIN_VALUE;

        // Find maximum element
        for (int i = 0; i < n; i++) {
            highest = Math.max(highest, nums[i]);
        }

        int low = 1;
        int high = highest;

        int ans = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int sum = 0;

            // Calculate sum after division
            for (int i = 0; i < n; i++) {

                if (nums[i] % mid != 0) {
                    sum += (nums[i] / mid) + 1;
                } else {
                    sum += nums[i] / mid;
                }
            }

            // Valid divisor
            if (sum <= threshold) {
                ans = Math.min(ans, mid);
                high = mid - 1;
            }

            // Need larger divisor
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}

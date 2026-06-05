class Solution {
    public int splitArray(int[] nums, int k) {
        int maxElement = Integer.MIN_VALUE;
        int totalSum = 0;

        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
            totalSum += num;
        }

        int low = maxElement;
        int high = totalSum;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int subarrays = 1;
            int currentSum = 0;

            for (int num : nums) {
                if (currentSum + num <= mid) {
                    currentSum += num;
                } else {
                    subarrays++;
                    currentSum = num;
                }
            }

            if (subarrays > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}

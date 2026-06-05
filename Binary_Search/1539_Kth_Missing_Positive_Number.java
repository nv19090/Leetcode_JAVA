class Solution {

    public int findKthPositive(int[] arr, int k) {

        int n = arr.length;

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Count missing numbers till index mid
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Final answer after binary search
        return k + right + 1;
    }
}

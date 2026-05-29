
/*
Leetcode : 3300_Minimum_Element_After_Replacement_With_Digit_Sum.
Time Complexity: O(n * d)
    n = number of elements in the array
    d = number of digits in the largest number

    For each element, we calculate the sum of its digits.
    If integers are bounded (e.g., <= 10^9), d is at most 10,
    so the practical time complexity is O(n).

Space Complexity: O(1)
    Only a few extra variables are used.
*/

class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int lower = nums[i];
            int sum = 0;

            while (lower != 0) {
                int p = lower % 10;
                sum += p;
                lower = lower / 10;
            }

            ans = Math.min(ans, sum);
        }

        return ans;
    }
}

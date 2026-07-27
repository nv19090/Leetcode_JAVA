class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= largest) {
                slargest = largest;
                largest = nums[i];
            } else if (nums[i] > slargest && nums[i] != largest) {
                slargest = nums[i];
            }
        }
        return (largest - 1) * (slargest - 1);
    }
}

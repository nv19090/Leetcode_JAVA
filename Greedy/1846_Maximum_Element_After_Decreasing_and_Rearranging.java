class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr[n - 1];
    }
}
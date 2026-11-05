class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length;
        int m= arr2.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m ; j++) {
                if ((Math.abs(arr1[i] - arr2[j])) <= d) {
                    count = 0;
                    break;
                } else { 
                    count = 1;
                }
            }
            if (count == 1) {
                ans += count;
            }
        }
        return ans;
    }
}

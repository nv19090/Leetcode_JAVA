class Solution {
    public int missingMultiple(int[] nums, int k) {
        int mx = Integer.MIN_VALUE;
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            mx = Math.max(mx, nums[i]);
        }
        int ans = 0;
        for (int i = 1; i <= mx+1; i++) {
            if (mp.containsKey(i * k)) {
                continue;
            } else {
                ans = i * k;
                break;
            }
        }
        return ans;
    }
}

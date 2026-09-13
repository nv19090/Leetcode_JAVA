class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            mn = Math.min(mn, nums[i]);mx = Math.max(mx, nums[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        for (int i = mn; i <= mx; i++) {
            if (mp.containsKey(i))    continue;
            else ans.add(i);
        }
        return ans;
    }
}

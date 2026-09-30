class Solution {
    public List<String> topKFrequent(String[] nums, int k) {
        int n = nums.length;
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return Integer.compare(b.getValue(), a.getValue());
            }
            return a.getKey().compareTo(b.getKey());
        });

        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            pq.add(entry);
        }
        int i = 0;
        List<String> ans = new ArrayList<>();
        while (!pq.isEmpty() && k > 0) {
            ans.add(pq.poll().getKey());
            i++;
            k--;
        }
        return ans;
    }
}

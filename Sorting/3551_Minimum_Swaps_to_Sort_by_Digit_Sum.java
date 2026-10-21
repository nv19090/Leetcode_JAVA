class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            int sum = 0;
            while (val > 0) {
                sum += val % 10;
                val /= 10;
            }
            mp.put(nums[i], sum);
        }
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(mp.entrySet());
        Collections.sort(list,
                Map.Entry.<Integer, Integer>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey()));
        int[] value = new int[list.size()];
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            value[k++] = entry.getKey();
        }
        HashMap<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            pos.put(value[i], i);
        }
        boolean[] visited = new boolean[n];
        int cycles = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = pos.get(nums[j]);
            }
            cycles++;
        }
        return n - cycles;
    }
}

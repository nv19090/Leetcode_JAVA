class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> mp = new HashMap<>();
        int ans = -1;
        int low = 0;
        for (int right = 0; right < n; right++) {
            mp.put(s.charAt(right), mp.getOrDefault(s.charAt(right), 0) + 1);
            while (mp.get(s.charAt(right)) > 2) {
                mp.put(s.charAt(low), mp.get(s.charAt(low)) - 1);
                low++;
            }
            ans = Math.max(ans, right - low + 1);
        }
        return ans;
    }
}

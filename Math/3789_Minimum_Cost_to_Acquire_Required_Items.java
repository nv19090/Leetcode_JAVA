class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = Long.MAX_VALUE;
        ans = Math.min(ans, (long)cost1 * need1 + (long)cost2 * need2);
        ans = Math.min(ans, (long)costBoth * Math.max(need1, need2));
        int common = Math.min(need1, need2);
        long cost = (long)common * costBoth+ (long)(need1 - common) * cost1+ (long)(need2 - common) * cost2;
        ans = Math.min(ans, cost);
        return ans;
    }
}

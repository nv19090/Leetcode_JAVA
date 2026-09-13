class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = numBottles;
        int filled_tobe = 0;
        int ans = numBottles;
        int p = numBottles;
        while (empty >= numExchange) {
            p = empty;
            while (p >= numExchange) {
                p -= numExchange;
                filled_tobe++;
            }
            ans += filled_tobe;
            empty = p + filled_tobe;
            p = empty;
            filled_tobe = 0;
        }
        return ans;
    }
}

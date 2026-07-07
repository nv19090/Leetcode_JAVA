class Solution {
    public long sumAndMultiply(int n) {
        long w = n;
        long x = 0;
        int i = 1;
        while (n != 0) {
            if (n % 10 == 0) {
                n = n / 10;
                continue;
            }
            w = n % 10;
            x = (w * (long) (Math.pow(10, i))) + x;
            n = n / 10;
            i++;
        }
        x = x / 10;
        long p = x;
        long sum = 0;
        while (p != 0) {
            long q = p % 10;
            sum = sum + q;
            p = p / 10;
        }
        long finalans = sum * x;
        return finalans;
    }
}

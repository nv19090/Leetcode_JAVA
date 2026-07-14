class Solution {
    public int myAtoi(String s) {
        return perform(s, 0, 1, 0L, false);
    }
    public int perform(String s, int i, int sign, long ans, boolean started) {

        if (i == s.length()) {
            return (int) (ans * sign);
        }
        char ch = s.charAt(i);
        if (!started && ch == ' ') {
            return perform(s, i + 1, sign, ans, false);
        }
        if (!started && (ch == '+' || ch == '-')) {
            sign = (ch == '-') ? -1 : 1;
            return perform(s, i + 1, sign, ans, true);
        }
        if (Character.isDigit(ch)) {
            started = true;
            ans = ans * 10 + (ch - '0');
            if (sign == 1 && ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (sign == -1 && -ans < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            return perform(s, i + 1, sign, ans, started);
        }
        return (int) (ans * sign);
    }
}

class Solution {

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String processStr(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (i < n) {

            if (s.charAt(i) == '#') {
                ans.append(ans.toString());
            }

            else if (s.charAt(i) == '*') {
                if (ans.length() > 0) {
                    ans.deleteCharAt(ans.length() - 1);
                }
            }

            else if (s.charAt(i) == '%') {
                ans.reverse();
            }

            else {
                ans.append(s.charAt(i));
            }

            i++;
        }

        return ans.toString();
    }
}

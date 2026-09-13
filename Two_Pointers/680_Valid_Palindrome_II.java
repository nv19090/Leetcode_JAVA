
class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        boolean ans = true;
        int i = 0;
        int j = n - 1;
        int flag = 0;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                if (flag == 0) {
                    flag = 1;
                    j--;
                } else {
                    ans = false;
                    break;
                }
            }
        }
        if (ans == false) {
            ans = true;
            flag = 0;
            i = 0;
            j = n - 1;

            while (i <= j) {
                if (s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
                } else {
                    if (flag == 0) {
                        flag = 1;
                        i++;
                    } else {
                        ans = false;
                        break;
                    }
                }
            }
        }

        return ans;
    }
}

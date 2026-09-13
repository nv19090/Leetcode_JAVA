class Solution {
    public boolean isPalindromic(String s) {
        int n = s.length();
        String Binary = "";
        for (int i = 0; i < n; i++) {
            int ascii = (int) s.charAt(i);
            String st = Integer.toBinaryString(ascii);
            Binary += st;
            while (Binary.length() < 8) {
                Binary = "0" + Binary;
            }
        }
        int i = 0;
        int j = Binary.length() - 1;
        while (i < j) {
            if (Binary.charAt(i) != Binary.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

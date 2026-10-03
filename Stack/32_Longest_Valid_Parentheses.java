class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int j = 0; j < n; j++) {
            if (s.charAt(j) == '(') {
                st.push(j);
            } 
            else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(j);
                } 
                else {
                    ans = Math.max(ans, j - st.peek());
                }
            }
       }
        return ans;
    }
}

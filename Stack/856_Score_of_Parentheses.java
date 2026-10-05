class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        boolean value = false;
        int balance = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '('){
                value=true;
                if(st.isEmpty()) st.push(1);
                else st.push(2*st.peek());
            }
            else  {
                if(value==true){
                    count+=st.peek();
                    st.pop();
                    value=false;
                }else
                st.pop();
            }
        }
        return count;
    }
}

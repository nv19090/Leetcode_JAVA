class Solution {

    public int cal(String[] tokens, int i, Stack<Integer> st) {
        int a = st.pop();
        int b = st.pop();

        if (tokens[i].equals("+")) {
            return b + a;
        } 
        else if (tokens[i].equals("-")) {
            return b - a;
        } 
        else if (tokens[i].equals("*")) {
            return b * a;
        } 
        else {
            return b / a;
        }
    }

    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (!tokens[i].equals("+") &&
                !tokens[i].equals("-") &&
                !tokens[i].equals("*") &&
                !tokens[i].equals("/")) {

                st.push(Integer.parseInt(tokens[i]));
            } 
            else {
                int p = cal(tokens, i, st);
                st.push(p);
            }
        }

        return st.peek();
    }
}

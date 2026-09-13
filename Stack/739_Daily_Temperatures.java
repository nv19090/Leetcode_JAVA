class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Stack<Integer> st = new Stack<>();
        int[] answer = new int[n];
        Arrays.fill(answer, 0);
        int j = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temp[i] > temp[st.peek()]) {
                int prev = st.pop();
                answer[prev] = i - prev;
            }
            st.push(i);
        }
        return answer;
    }
}

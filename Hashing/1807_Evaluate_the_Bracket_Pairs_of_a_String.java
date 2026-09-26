class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder st = new StringBuilder();
        HashMap<String, String> mp = new HashMap<>();
        for (int i = 0; i < knowledge.size(); i++) {
            mp.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                int j = i + 1;
                while (s.charAt(j) != ')') {
                    j++;
                }
                String key = s.substring(i + 1, j);
                if (mp.containsKey(key)) {
                    st.append(mp.get(key));
                } else {
                    st.append('?');
                }
                i = j;
            } 
            else {
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}

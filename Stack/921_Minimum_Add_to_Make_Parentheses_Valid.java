class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int op=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else{
                if(s.charAt(i)==')'){
                    if(st.isEmpty()){
                        op++;
                    }
                    else{
                        if(st.peek()=='(') st.pop();
                    }
                }
            }
        }
        return op+st.size();
    }
}

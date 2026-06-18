class Solution {
    public boolean checkValidString(String s) {
        int open_bracket = 0;
        int closing_bracket=0;
        int star = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open_bracket++; 
                closing_bracket++;
            } else if (s.charAt(i) == ')') {
                open_bracket--;
                closing_bracket--;
            }
            else{
                open_bracket--;
                closing_bracket++;
            }
            if(closing_bracket<0) return false; 
            open_bracket=Math.max(open_bracket,0);
        }
            return open_bracket==0;
    }
}

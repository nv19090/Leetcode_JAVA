class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder st=new StringBuilder();
        if(sum>9*num) return "";
        for(int i=0;i<num;i++){
            int number=Math.min(9,sum);
            st.append(number);
            sum-=number;
        }
        return st.toString();
    }
}

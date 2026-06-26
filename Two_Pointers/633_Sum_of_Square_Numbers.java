class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(int)(Math.sqrt(c));
        while(i<=j){
            long ans=i*i+j*j;
            if(ans==c){
                return true;
            }
            else if(ans>c){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}

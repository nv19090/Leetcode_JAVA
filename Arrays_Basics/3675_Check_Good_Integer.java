class Solution {
    public boolean checkGoodInteger(int n) {
        int p=n;
        int sum=0;
        int sq=0;
        while(p!=0){
            int s=p%10;
            sum+=s;
            sq=sq+(s*s);
            p=p/10;
        }
        if(sq-sum>=50) return true;
        return false;
    }
}

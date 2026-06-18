class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n!=0){
            int s=n%10;
            product*=s;
            sum+=s;
            n=n/10;
        }
        return product -sum;
    }
}

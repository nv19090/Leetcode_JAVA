class Solution {
    public boolean checkDivisibility(int n) {
        int p=n;int sum=0;int product=1;
        while(p!=0){
            int s=p%10;
            sum+=s;
            product*=s;
            p=p/10;
        }
        int total=sum+product;
        return n%total==0;
    }
}

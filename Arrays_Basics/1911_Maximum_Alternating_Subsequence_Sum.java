class Solution {
    public int alternatingSum(int[] nums) {
        int sign=-1;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum+=nums[i];
            }
            else{
                sum=sum+(sign*nums[i]);
            }
        }
        return sum;
    }
}

class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if( count(nums,nums[i],0)%2==0){
                count++;
            }
        }
        return count;
    }
    public int count(int[] nums,int n,int count){
        if(n==0){
            return count;
        }
        int s=n%10;
        count++;
        return count(nums,n/10,count);
    }
}

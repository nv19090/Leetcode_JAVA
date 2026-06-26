class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int n = nums.length;
        int count=0;
        int i=0;int j=n-1;
        while(i<=j){
            if(nums[i]+nums[j]<=limit){
                count=count+1;
                i++;
                j--;
            }
            else{
                count++;
                j--;
            }
        }
        return count;
    }
}

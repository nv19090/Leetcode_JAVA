class Solution {
    public boolean checking(int value,int i,int sum){
        while(value>0){
            sum=sum+(value%10);
            value=value/10;
        }
        if(sum==i) return true;
        return false;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if( checking(nums[i],i,0)){
                return i;
            }
        }
        return -1;
    }
}

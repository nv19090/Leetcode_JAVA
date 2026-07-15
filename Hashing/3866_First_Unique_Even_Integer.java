class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int num:nums){
            if(num%2==0&&mp.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}

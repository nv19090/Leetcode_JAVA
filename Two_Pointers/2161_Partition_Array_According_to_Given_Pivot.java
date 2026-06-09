class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int [] ans= new int[n];
        int i=0;
        int j=0;
        while(i<n){
            if(nums[i]<pivot){
                ans[j]=nums[i];
                j++;
            }
            i++;
        }
        i=0;
        while(i<n){
            if(nums[i]==pivot){
                ans[j]=pivot;
                j++;
            }
            i++;
        }
        i=0;
        while(i<n){
            if(nums[i]>pivot){
                ans[j]=nums[i];
                j++;
            }
            i++;
        }
        return ans;
    }
}

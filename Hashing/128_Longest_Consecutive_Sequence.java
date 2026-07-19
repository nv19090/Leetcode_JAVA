class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length==0) return 0;
        for (int num : nums) {
            set.add(num);
        }
        int ans=-1;
        int count=1;
        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]+1==arr[i]){
                count++;
            }
            else{
                ans=Math.max(ans,count);
                count=1;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}

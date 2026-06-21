class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n=costs.length;
        int count=0;
        Arrays.sort(costs);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=costs[i];
            if(sum<=coins){
                count++;
            }
            else{
                sum-=costs[i];
            }
        }
        return count;
    }
}

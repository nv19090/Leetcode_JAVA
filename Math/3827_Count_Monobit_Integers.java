class Solution {
    public int countMonobit(int n) {
        //Integer.toBinaryString(value) is the way to get binary string in java
        int ans=0;
        for(int i=0;i<=n;i++){
            String res=Integer.toBinaryString(i);
            int count1=0;
            int count=0;
            for(int j=0;j<res.length();j++){
                if(res.charAt(j)=='0'){
                    count++;
                }
                else count1++;
            }           
            if(count==res.length()||count1++==res.length()){
                ans++;
            }
        }
        return ans;
    }
}

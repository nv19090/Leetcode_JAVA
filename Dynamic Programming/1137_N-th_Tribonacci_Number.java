class Solution {
    public int tribonacci(int n) {
        return tribonacci(n,new HashMap<>());
    }
    public int tribonacci(int n,HashMap<Integer,Integer> mp){
        if(n==0) return 0;
        else if(n<=2) return 1;
        if(mp.containsKey(n)) return mp.get(n);
        int result=tribonacci(n-1,mp)+tribonacci(n-2,mp)+tribonacci(n-3,mp);
        mp.put(n,result);
        return result;
    }
}

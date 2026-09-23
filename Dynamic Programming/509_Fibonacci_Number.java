class Solution {
    public int fib(int n,HashMap<Integer,Integer> mp) {
        if(n<=1) return n;
        if(mp.containsKey(n)){
            return mp.get(n);
        }
        int result=fib(n-1,mp)+fib(n-2,mp);
        mp.put(n,result);
        return result;
    }
    public int fib(int n) {
        return fib(n,new HashMap<>());
    }
}

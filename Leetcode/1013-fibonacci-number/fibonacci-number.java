class Solution {
    public int fib(int n) {
        //base case
        if(n<=1) return n;

        //resursive case
        return fib(n-1)+fib(n-2);
        
    }

}